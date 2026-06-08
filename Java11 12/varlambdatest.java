import java.util.Arrays;
import java.util.List;

@interface NonNull {}  // for demonstration

public class varlambdatest {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Java","Python","Js");
        names.forEach((@NonNull var name)->{
            System.out.println("Names"+name.toUpperCase());
        });

    }
    
}
