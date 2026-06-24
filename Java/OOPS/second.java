// loose Coupling 

class Engine{ 
    void starts(){
        System.out.println("engine started");
    }
}
class PetrolEngine extends Engine{ //extends engine,so any petrol engine will at runtime create obj
    void starts(){
        System.out.println("Petrol engine started");
    }
}
class DieselEngine extends Engine{ //extends engine,so any petrol engine will at runtime create obj
    void starts(){
        System.out.println("Diesel engine started");
    }
}
class Car{  // no need to chnage the car class 
    private Engine engine;
    Car(Engine engine){
        this.engine=engine;
    }
     public void display(){
        engine.starts();
        System.out.println("The display funcitons inside car");
    }
}
class second{
    public static void main(String[] args) {
        Engine pobj=new PetrolEngine(); 
        Car obj=new Car(pobj);
        obj.display();
        //Petrol engine started
        //The display funcitons inside car

        Engine dobj=new DieselEngine();
        Car obj1=new Car(dobj);
        obj1.display();
        //Diesel engine started
        //The display funcitons inside car

        Engine eobj=new Engine();
        Car obj2=new Car(eobj);
        obj2.display();
        // engine started
        // The display funcitons inside car
    }
}


// Car depends on Engine, not PetrolEngine
// Any subclass of Engine can be injected
// Car does not know which type of engine it is using
// You can change engine behavior without modifying Car

// private PetrolEngine engine = new PetrolEngine(); // tightly coupled
// Car is fixed to PetrolEngine
// Cannot reuse Car for DieselEngine / ElectricEngine
// Changing engine requires modifying Car code



// Cohension

// class Calculator{
//   int add(int a, int b){
//     return a+b;
//   }
//   int sub(int a, int b){
//     return a-b;
//   }
// }
// class second {
//     public static void main(String[] args) {
//         Calculator obj =new Calculator();
//         System.out.println("Addition"+" "+obj.add(5,5));
//         System.out.println("Subtraction"+ " "+obj.sub(5,5));

//     }
// }

