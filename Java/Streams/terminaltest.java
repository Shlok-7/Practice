
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class terminaltest {
    public static void main(String[] args) {
        
        List<Integer> salaries=Arrays.asList(90000, 60000, 45000, 80000, 75000);

        // count
        long highEarnCount=salaries.stream().filter(n->n>65000).count();
        System.out.println("High Earning saleries count "+ highEarnCount);

        //anymatch
        boolean hasEntryLevel=salaries.stream().anyMatch(s->s==45000);
        System.out.println("Has entry level salary 45000"+hasEntryLevel);

        //reduce
        int toatalPayRoll=salaries.stream().reduce(0, (a,b)->a+b);
        System.out.println("Total pay roll"+ toatalPayRoll);

        //parallelstream
        System.out.println("parallel stream output is random");
        salaries.parallelStream().forEach(n->System.out.println(n));
        
        //findfirst
        Optional<Integer> firstSalary = salaries.stream().findFirst();
        System.out.println("First salary in stream: " + firstSalary.orElse(null));

        //findany
        Optional<Integer> anysalary=salaries.parallelStream().findAny();
        System.out.println("Random salary in stream:"+anysalary.orElse(null));
    }
    
}
