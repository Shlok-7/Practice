import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class teeingcollector {
    public static void main(String[] args) {
        List<Integer> salaries=Arrays.asList(50000, 120000, 40000, 80000, 95000);

        String report=salaries.stream().collect(
            Collectors.teeing(
                Collectors.maxBy(Integer::compareTo),
                Collectors.minBy(Integer::compareTo),
                (highest ,Lowest)->{
                    int max=highest.orElse(0);
                    int min =Lowest.orElse(0);
                    return "Highest salary"+max +" Lowest salary"+min;
                }
            )
        );
        System.out.println(report);
    }
    
}
