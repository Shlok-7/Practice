import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streamstest {
    public static void main(String[] args) {
        List<String> name=Arrays.asList("Shlok","Bob","Peter");
        List<String> filteredname=name.stream()
        .filter(n -> n.startsWith("b"))
        .collect(Collectors.toList());
        System.out.println(filteredname);
    }
    
}
