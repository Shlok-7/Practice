
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class FunctionalInterfaceTesting {

    public static void main(String[] args) {
        
        // Setup our initial list, just like your code.
        List<Integer> numLst = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Given List is : ");
        System.out.println(numLst);


        // 1. PREDICATE (Used for Filtering)
        // Predicate takes an input and returns a boolean (true/false).
        // Note: I fixed the math here so it actually filters for Even numbers!
        Predicate<Integer> p1 = n -> n % 2 == 0;
        
        List<Integer> evenNumbersLst = numLst.stream()
                                             .filter(p1)
                                             .collect(Collectors.toList());  // collect is use to collect the stream of data, collectors.toList is the method use to call the list 
                                             
        System.out.println("\nPredicate Filter : Even numbers...");
        System.out.println(evenNumbersLst);


        // 2. FUNCTION (Used for Transforming/Mapping)
        // Function takes an input, modifies it, and returns a totally new output.
        // Let's multiply every even number by 10.
        Function<Integer, Integer> f1 = n -> n * 10;
        
        List<Integer> multipliedDataLst = evenNumbersLst.stream()
                                                        .map(f1)
                                                        .collect(Collectors.toList());
                                                        
        System.out.println("\nFunction Map : Multiplied by 10...");
        System.out.println(multipliedDataLst);


        // 3. CONSUMER (Used for Executing Actions)
        // Consumer takes an input but returns NOTHING (void). Used for side-effects like printing.
        // Let's print each of our newly multiplied numbers with a custom message.
        Consumer<Integer> c1 = n -> System.out.println("Processed Number: " + n);
        
        System.out.println("\nConsumer forEach : Printing final data...");
        // Notice we don't collect data here, we just consume it directly!
        multipliedDataLst.stream().forEach(c1);


        // 4. SUPPLIER (Used for Generating Data)
        // Supplier takes NO input, but generates and returns an output.
        // Streams don't use Suppliers for looping, but we use them to generate default values.
        Supplier<String> s1 = () -> "Stream processing is completely finished!";
        
        System.out.println("\nSupplier Get : Fetching a generated message...");
        System.out.println(s1.get());
    }
}
