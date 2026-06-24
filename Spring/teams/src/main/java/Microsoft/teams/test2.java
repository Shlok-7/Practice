package Microsoft.teams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	int id;
	String name;
	String dept;
	String designation;
	
	
	Employee(int id, String name,String dept,String designation){
		this .id=id;
		this.name=name;
		this.dept=dept;
		this.designation=designation;
	}
	public String toString() {
		return id + " | " + name + " | " + designation; 
	}
	
}
public class test2 {

	public static void main(String[] args) {
		
		// Sort using name 
		List<Employee> emp= new ArrayList<>();
		emp.add(new Employee(1,"Shlok","It","GenC"));
		emp.add(new Employee(2,"Prasad","It","GenC"));
		emp.add(new Employee(3,"Onkar","It","GenC"));
		emp.add(new Employee(4,"Priyanshu","It","GenC"));
		emp.add(new Employee(5,"Ch","It","Trainer"));
		List<Employee>ansemp = emp.stream()
				.sorted(Comparator
				.comparing(empc -> empc.name))
				.collect(Collectors.toList()); 
		ansemp.forEach(i->System.out.println(i.name));
		ansemp.forEach(System.out::println);
		
		
	}

}
