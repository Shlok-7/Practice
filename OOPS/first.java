//constructor
/*
 public class first{
    int x;
    String n;
     first(){ //no paramater
        x=5;
    }
    first(int i,String name){ //paramater
        x=i;
        n=name;
    }
    first(first f){ //copy
        x=f.x;
        n=f.n;
    }
    public static void main(String[] args) {
        first myobj=new first();
        System.out.println(myobj.x);
        first myobj1=new first(101,"Shlok");
        System.out.println(myobj1.x+ myobj1.n);
        first myobj2=new first(myobj1);
        System.out.println(myobj2.x+myobj2.n);
    }
}
 */
// Ploymorphism
//Method overriding
/*
class Animal{
    void sounds(){
        System.out.println("The animal sounds");
    }
    void eats(){
        System.out.println("The animal eats");
    }
}
class Dog extends Animal{
    @Override
    void sounds(){
        System.out.println("The Dog Barks");
    }
    void eatsAsAnimal(){ // call parent eats method
        super.eats();
    }
}

public class first{
    public static void main(String[] args) {
        Animal animal=new Animal();
        animal.sounds();
        Dog dog=new Dog();
        dog.sounds();
        Animal boanimal= new Dog();
        boanimal.sounds();

        ((Dog)boanimal).eatsAsAnimal();

    }
}
 */
//Method overloading
/*
class first {

    static int Operations(int x, int y) {
        return x + y;
    }

    static double Operations(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println(Operations(5, 10));
        System.out.println(Operations(5.5, 10.5));
    }

}
*/
/*
// Abstracion
abstract class Animal{
    abstract void makesSound();  // abstract method
    void eats(){  // non abstract method
        System.out.println("Animal Eats");
    }
}
class Dog extends Animal{
    @Override
    void makesSound(){
        System.out.println("Dog Barks");
    }
}
class first{
    public static void main (String[]args){
        Animal obj=new Dog();
        obj.makesSound();
        obj.eats();
    }
}
*/
// interfaces
/*
interface flyable{
    void fly();
}
 class Bird implements flyable{
    public  void fly(){
        System.out.println("Bird flys ");
    }
}
class first{
    public static void main(String[] args) {
        flyable obj=new Bird();
        obj.fly();
    }
}
*/
// encapsulation
/*
class Student {
    private String name;
    private int rollno;

    public void setname( String name){
        this.name=name;
    }
    public String getname(){
        return name;
    }
    public void setrollno( int rollno){
        this.rollno=rollno;
    }
    public int getrollno(){
        return rollno;
    }

}
class first{
    public static void main(String[] args) {
        Student s =new Student();
        s.setname("Shlok");
        s.setrollno(101);
        System.out.println(s.getname()+s.getrollno());
    }
}
*/

// Inhertiance

class Animal{
    void Eats(){
        System.out.println("Animal Eating");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog barking");
    }
}
class first{
    public static void main(String[] args) {
        Dog d=new Dog();
        d.sound();
        d.Eats();
    }
}
