
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* 
public class timertask {

    public static void main(String[] args) {
        Timer timer =new Timer();
        TimerTask timertask=new TimerTask() {
            public void run(){
                System.out.println("BEEPPP, TIME IS UP");
                timer.cancel();
            }
        };
        timer.schedule(timertask, 2000);
    }
    
}
 */
// public class executortest{
//     public static void main(String[] args) {
//         ExecutorService pool=Executors.newFixedThreadPool(10);
//         for(int i=1;i<=5;i++){
//             final int taskId=i;
//             pool.execute(()->{
//                 System.out.println("executing task"+taskId+"on"+Thread.currentThread().getName());
//             });
//         }
//         pool.shutdown();
//     }
// }
public class executortest {

    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(5);
        for (int i = 1; i <= 10; i++) {
            final int taskId = i;
            pool.execute(() -> {
                System.out.println("Executing task " + taskId + "on" + Thread.currentThread().getName());

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }
        pool.shutdown();
    }
}

//ScheduleExecutorService
// import java.util.concurrent.*;

// public class FixedRateExample {
//     public static void main(String[] args) {

//         ScheduledExecutorService scheduler =
//                 Executors.newScheduledThreadPool(1);

//         Runnable task = () -> {
//             System.out.println("Running at "
//                     + java.time.LocalTime.now());
//         };

//         // Start after 1 sec, then run every 2 sec
//         scheduler.scheduleAtFixedRate(
//                 task,
//                 1,   // initial delay
//                 2,   // period
//                 TimeUnit.SECONDS
//         );
//     }
// }

