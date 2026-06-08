
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.TemporalAdjusters;

class utilityandsystem{
    public static void main(String[] args)  throws Exception{
        //math
        int maxval=Math.max(10,5);
        int minval=Math.min(2, 3);
        double power=Math.pow(2,3);
        System.out.println(maxval+" "+minval+" "+power);

        // runtime
        Runtime runtime =Runtime.getRuntime();
        System.out.println(runtime.freeMemory());
        System.out.println(runtime.availableProcessors());
        System.out.println(runtime.totalMemory());



        //procces
        Process p=runtime.exec("notepad.exe");

        //system class
        long starttime=System.currentTimeMillis();
        System.out.println(starttime);

        //localdate
        LocalDate today= LocalDate.now();
        LocalTime rightnow=LocalTime.now();

        LocalDate mybirthday=LocalDate.of(2025, Month.FEBRUARY, 26);
        System.out.println("Today is "+today+"mybirthday"+mybirthday);

        Instant now=Instant.now();
        System.out.println(now);
 
       //period
        LocalDate future= today.plus(Period.ofDays(5));
        System.out.println("Added 5 days "+future);

        //duration
        LocalTime start =LocalTime.of(10, 00);
        LocalTime end=LocalTime.of(12, 20);
        Duration shift =Duration.between(start, end);
        System.out.println("Shift length in minutes "+shift.toMinutes());

        //TemporalAdjusters
        LocalDate payday =today.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("Pay day"+payday);

    }
}