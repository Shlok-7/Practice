
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

class Employee{
    int id;
    String name;
    String department;
    int salary;

    Employee(int id,String name,String department,int salary) {
        this.id=id;
        this.name=name;
        this.department=department;
        this.salary=salary;
    }
    //Getter are good practise to have 
    public int getid(){return id;}
    public String getname(){return name;}
    public String getdepartment(){return department;}
    public int getsalary(){return salary;}
}
public class streamsquestion {
    public static void main(String[] args) {

        List<Employee> emp=Arrays.asList(
            new Employee(1, "Shlok", "It", 30000),
            new Employee(2, "Ram", "CS", 50000),
            new Employee(3, "Krish", "HR", 70000),
            new Employee(4, "Krish", "CS", 900000),
            new Employee(5, "Naryan", "It", 950000),
            new Employee(6, "Ash", "CS", 1000000),
            new Employee(7, "Esh", "CS", 1000000)

        );
        
        // 1. Print all names of employees
        emp.stream().map(Employee::getname).forEach(System.out::println);

        //2. Get the list of employee from IT departement
       List<String> empit= emp.stream().filter(n->n.getdepartment().equals("It")).map(Employee::getname).collect(Collectors.toList());
       System.out.println("Employees from IT:"+empit);

       //3. Count employees earning more than 50,000
       long count=emp.stream().filter(n->n.getsalary() > 50000).count();
       System.out.println("Employees earning more than 50,000:"+ " "+count);

       //4.Names of employees earning more than 50,000
       emp.stream().filter(n->n.getsalary() > 50000).map(Employee::getname).forEach(System.out::println);

       //5.Find employee with highest salary
       String maximum=emp.stream().max(Comparator.comparing(Employee::getsalary)).map(Employee::getname).orElse(null);
       System.out.println("Maximum Salary:"+ maximum);

       //5.1.Names of all employees with highest salary
       int maxsalary=emp.stream().mapToInt(Employee::getsalary).max().orElse(0);
       List<String> listemp=emp.stream().filter(empm->empm.getsalary()==maxsalary).map(Employee::getname).collect(Collectors.toList());
       System.out.println(listemp);

       //6. Average salary of all employees
       double avg=emp.stream().mapToInt(Employee::getsalary).average().orElse(0.0);
       System.out.println("Average :"+avg);

       //7.Group employees by department
       Map<String,List<String>> group=emp.stream().collect(Collectors.groupingBy(Employee::getdepartment,Collectors.mapping(Employee::getname, Collectors.toList())));
       System.out.println(group);

       //8.Count employees in each department
       Map<String,Long> couting=emp.stream().collect(Collectors.groupingBy(Employee::getdepartment, Collectors.counting()));
       couting.forEach((depts,counts)->System.out.println("["+depts+" ->"+counts+"]"));

       //9.Highest paid employee from each department
       Map<String,Optional<Employee>> highpaid=emp.stream().collect(Collectors.groupingBy(Employee::getdepartment , Collectors.maxBy(Comparator.comparing(Employee::getsalary))));
       highpaid.forEach((depts,opt)->opt.ifPresent(empss->System.out.println(depts+"->"+empss.getname())));

       //Q10. Sort employees by salary (descending)
       List<String>declist=emp.stream().sorted(Comparator.comparing(Employee::getsalary).reversed()).map(Employee::getname).collect(Collectors.toList());
       System.out.println(declist);

       //Q11. Find second highest salary  (VERY COMMON)
       Optional<Integer> secondhigh=(emp.stream().map(Employee::getsalary).distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst());
       System.out.println(secondhigh.get());  // find first always return optional always so we can use .get to the element without the keyword Optional
       System.out.println(secondhigh);

       //Q.12Check if any employee earns more than 1 lakh
       boolean morelakh= emp.stream().anyMatch(n->n.salary > 1000000);
       System.out.println(morelakh);

       //Q.13  Convert List → Map<Id, Name>
       Map<Integer,String> conversion=emp.stream().collect(Collectors.toMap(Employee::getid, Employee::getname));
       conversion.forEach((key,value)-> {
        System.out.println(key +"->"+value);
       });

       //Q14. Find employees whose name starts with ‘A’
       List<String> names=emp.stream().filter(n->n.getname().startsWith("A")).map(Employee::getname).collect(Collectors.toList());
       names.forEach(i->System.out.println(i));

       // Q.15 Sort employees by name, then salary
       List<String> sortEmp=emp.stream().sorted(Comparator.comparing(Employee::getname).thenComparing(Employee::getsalary)).map(Employee::getname).collect(Collectors.toList());
       System.out.println(sortEmp);

       //Q16. Print only duplicates
       Set<String> st=new HashSet<>();
       List<String> duplicates=emp.stream().filter(s -> !st.add(s.getname())).map(Employee::getname).collect(Collectors.toList());
       System.out.println(duplicates);

       //Q17. Filter employees whose name starts with "A" or "E".
      List<String>fil = emp.stream().filter(i->i.getname().startsWith("A")|| i.getname().startsWith("E")).map(Employee::getname).collect(Collectors.toList());
      System.out.println(fil);

      //Q18.Sort employees by department, then by salary
      List<String> eds=emp.stream().sorted(Comparator.comparing(Employee::getdepartment).thenComparing(Employee::getsalary)).map(Employee::getname).collect(Collectors.toList());
      System.out.println(eds);

     //Q.19.Sort IT employees by highest salary
     List<String> its=emp.stream().filter(s->s.getdepartment().equals("It")).sorted(Comparator.comparingInt(Employee::getsalary).reversed()).map(Employee::getname).collect(Collectors.toList());
     System.out.println(its);

     //Q.20.Get top 3 highest‑paid employees
     List<String> top=emp.stream().sorted(Comparator.comparingInt(Employee::getsalary).reversed()).map(Employee::getname).limit(3).collect(Collectors.toList());
     System.out.println(top);
 
     //Q.21.Group employees by department
     Map<String,List<String>> empd=emp.stream().collect(Collectors.groupingBy(Employee::getdepartment,Collectors.mapping(Employee::getname,Collectors.toList()) ));
    empd.forEach((d,e)->System.out.println(d+"->"+e));

     //Q.22.Count employees in each department
     Map<String,Long> coudep=emp.stream().collect(Collectors.groupingBy(Employee::getdepartment,Collectors.counting()));
     System.out.println(coudep);

     //Q.23.Highest salary in each department
     Map<String,Optional<Employee>> highe=emp.stream().collect(Collectors.groupingBy(Employee::getdepartment, Collectors.maxBy(Comparator.comparingInt(Employee::getsalary))));
     highe.forEach((d,s)->System.out.println(d+"->"+s.get().getsalary()));

    }
    
}
