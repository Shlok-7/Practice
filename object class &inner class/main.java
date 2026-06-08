//Object Class
class main{

    public static void main(String[] args) {

        // Creating an Object class object
        Object obj = new Object();

        // Calling methods of Object class
        System.out.println("toString(): " + obj.toString());
        System.out.println("hashCode(): " + obj.hashCode());
        System.out.println("getClass(): " + obj.getClass());
        System.out.println("equals(): " + obj.equals(obj));
    }
}



/*
//inner class
class car{   
     private String model="Sedan";
     //Regular Inner Class (Has access to Outer class's variables)
     class Engine{
        void start(){
            System.out.println("Starting engine for "+model);
        }
     }
     //Static Nested Class (Cannot access non-static Outer variables)
     static class Usbport{
        void charge(){  
         System.out.println("Charging phone.......");

        }
     }
}
class main{
  public static void main(String[] args) {
    car obj=new car();
    car.Engine engine= obj.new Engine();
    engine.start();

    car.Usbport charge= new car.Usbport();
    charge.charge();

  }
}
*/

// public class Main {
//     public static void main(String[] args) {

//         Greeting g = new Greeting() {   // anonymous class
//             void sayHello() {
//                 System.out.println("Hello from anonymous class");
//             }
//         };

//         g.sayHello();
//     }
// }
