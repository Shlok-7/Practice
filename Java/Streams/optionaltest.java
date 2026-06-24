
import java.util.Optional;

class Emp{
    int id;
    String name;
    String dept;
    String designation;

    Emp(int id,String name,String dept,String designation){
        this.id=id;
        this.name=name;
        this.dept=dept;
        this.designation=designation;
    }
}
public class optionaltest {
    public static Emp getdata(int id){
        Emp empobj=null;
        if(id==1)
            empobj=new Emp(1, "Shlok", "IT", "GENC");
        return empobj;
    }
    public static void main(String[] args) {
        Emp empobj=getdata(1);

        //ofnullable will return the optional class embedding the original object.
        //If the internal object is null it will return Optional.empty
        Optional<Emp> emOptional=Optional.ofNullable(empobj);
        System.out.println("Optional Class :"+emOptional);

        //if the data is present in the optional class holds a valid object then,isPresent() will return true
        if(emOptional.isPresent())
            System.out.println("Designation of employee id "+emOptional.get().designation);
        else
            System.out.println("Invalid employee id");     
    }
}
    


