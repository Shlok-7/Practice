
public class Threaddemo   {
    public static void main(String[] args)throws InterruptedException {
        
    
    Thread t1=new Thread(()->{
 
            for(int i=1;i<=5;i++){
                System.out.println("Hi");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    System.getLogger(Threaddemo.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
                }
            }
        
    });
    Thread t2=new Thread(()->{
            for(int i=1;i<=5;i++){
            System.out.println("Hello");
                     try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    System.getLogger(Threaddemo.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
                }
        }
        
    });
    t2.setName("Second Thread");
    System.out.println(t1.getName());
    System.out.println(t2.getName());
    t1.setPriority(1);
    t2.setPriority(2);
    System.out.println(t2.getPriority());  //2  executes first higher number more priority
    System.out.println(t1.getPriority());  //1

    


    t1.start();
    Thread.sleep(10);
    t2.start();
    System.out.println(t1.isAlive());

    t1.join();
    t2.join();

    System.out.println("Bye");
   
   


}  
}