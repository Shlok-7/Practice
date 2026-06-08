
import java.util.Arrays;


/* 
class MyWorker implements Runnable{
    @Override
    public void run(){
        System.out.println("Worker thread us running in the background ");
    }
}
public class threadtest{
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread started");

        Thread backgrounThread=new Thread(new MyWorker());

        backgrounThread.start();
        backgrounThread.sleep(5000);
        System.out.println("Main thread finished");

    }
}
 */


 //2 .Suspending , resuming and stopping threads

/*
 class SafeWorker implements Runnable{
    private  volatile boolean keeprunning=true;
    public void run(){
        while(keeprunning){
            System.out.println("WORKING<<<<<<<<");

        }
        System.out.println("Worker stopped safetly");
    }
    public void stopWorking(){
        this.keeprunning=false;
    }
 }
 public class threadtest{
    public static void main(String[] args) throws InterruptedException {
        SafeWorker worker=new SafeWorker();
        Thread t=new Thread(worker);

        t.start();
        Thread.sleep(100);

        worker.stopWorking();
        
    }
 }
 */

 // serial and parallel sort 
// class threadtest{
//     public static void main(String[] args) {
//         int[] no={5,2,9,1,6,3};

//         Arrays.sort(no);
//         // Arrays.toString(no);
//         for(int n: no)
//             System.out.print(n + " ");

//         Arrays.parallelSort(no);

//         for(int n :no)
//            System.out.print("  "+n);

        

//     }
// }