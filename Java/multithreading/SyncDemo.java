

class counter {
    int count;
    public synchronized  void increment(){
        count++;
    }
    
}
public class SyncDemo{
    public static void main(String[] args) throws InterruptedException {
        counter c=new counter();
        Thread t1=new Thread(new Runnable() {
            public void run(){
                for(int i=1;i<=1000;i++){
                    c.increment();
                }
            }  
        });
        Thread t2=new Thread(new Runnable() {
            public void run(){
                for(int i=1;i<=1000;i++){
                    c.increment();
                }
            }  
        });
        t1.start();
        t2.start();

        t1.join(); // the further tasks wait untill t1 finishes
        t2.join();// the further tasks wait untill t2 finishes

        System.out.println("Count"+c.count);


    }
}
