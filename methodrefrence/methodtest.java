@FunctionalInterface
interface IGoogleMaps{
    public void displaydirections();
}
class methodtest{

    //constructor
     methodtest() {
        System.out.println("Constructor...... Displaying directions");
    }

    // static method refernece
    public static void statdisplay(){
        System.out.println("Static...... Displaying Directions");
    }

    // object method refernece
    public void objdisplay(){
        System.out.println("Object.......Displaying Directions");
    }

    public static void main(String[] args) {
        IGoogleMaps cobj=methodtest::new;
        cobj.displaydirections();

        IGoogleMaps sobj=methodtest::statdisplay;
        sobj.displaydirections();

        methodtest obj=new methodtest();
        IGoogleMaps oobj= obj::objdisplay;
        oobj.displaydirections();
    
  
    }
}