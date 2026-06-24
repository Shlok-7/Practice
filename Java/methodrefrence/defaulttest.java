 interface vehicle{
    void engine();
    default void soundhourn(){
        System.out.println("BEEP THE DEAFULT METHOD IS BEING CALLED ");
    }
}
class car implements vehicle{
    @Override
     public void engine(){
        System.out.println("ABSTRACT METHOD");
    }
}
public class defaulttest {
    public static void main(String[] args) {
        vehicle obj=new car();
        obj.engine();
        obj.soundhourn(); // default method called directly without implementing

    }

    
}
