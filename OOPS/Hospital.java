abstract class Doctor {
    abstract  void treat();
    
}
class Surgeon extends Doctor{
    @Override
    public void treat(){
        System.out.println("Surgeon is treating");
    }
}
class Gyanc extends Doctor{
    @Override
    public void treat(){
        System.out.println("Gyanc is treating");
    }
}

public class Hospital{
    public static void main(String[] args) {
        Doctor d1=new Surgeon();
        d1.treat();
        Doctor d2= new Gyanc();
        d2.treat();
    }
}

/*
Abstract class provide moderly loose coupling then the interface , it can also lead to tight coupling when they
 abstract class controls everything, 

 abstract class Doctor {
    void doTreatment() {
        System.out.println("Step 1: Check vitals");
        treat();
        System.out.println("Step 3: Generate bill");
    }

    abstract void treat();
}

 Surgeon is forced to follow all steps

Must check vitals 
Must generate bill 
Cannot change flow 

 Surgeon has no freedom
 This is tight coupling



 share to much of data 

 abstract class Doctor {
    int fees = 500;
    String hospital = "City Hospital";
}
     All doctors depend on:

same hospital
same fees

 If you change: fees :1000
 All subclasses affected 
 This is tight coupling
 */



