package Microsoft.teams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


class EmployeeD{
	int id;
	String name;
	String designation;
	String dept;

 EmployeeD(int id,String name,String designation,String dept){
	this.id=id;
	this.name=name;
	this.designation=designation;
	this.dept=dept;
 }
 @Override
	public String toString() {
		return "name"+ name +" "+dept+" "+designation ;
	}
 }

public class test3 {


	public static void main(String[] args) {
		
		List<EmployeeD> emp= new ArrayList<>();
		emp.add(new EmployeeD(1,"Shlok","Genc","IT"));
		emp.add(new EmployeeD(2,"Ram","Genc","IT"));
		emp.add(new EmployeeD(3,"Krish","Genc","IT"));
		emp.add(new EmployeeD(4,"Krs","Genc","IT"));
	
		List<EmployeeD> ans=emp.stream().sorted(Comparator.comparing(s->s.name)).collect(Collectors.toList());
		ans.forEach(System.out::println);

	}

}
