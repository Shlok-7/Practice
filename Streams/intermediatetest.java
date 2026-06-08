import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class intermediatetest {
    public static void main(String[] args) {
        List<Integer> numbers=Arrays.asList(20,30,80,70,99,78,65,20,80);

        //start the stream
        List<Integer> processednumbers=numbers.stream()
         //.skip(2) throws a way first two numbers 20 and 30
        .skip(2)
        // .filter(n->n>30) keeps only those elements that are greater than 30
        .filter(n->n>30)
        //.distinct()removes duplicates if any 
        .distinct()
        //.map(n-> n*2) transforms each element by multiplying it by 2
        .map(n ->n*2)
        //.sorted() arrange the transform numbers into ascending order
        .sorted()
        //.peek() looks at the data purely to print it without changing 
        .peek(n->System.out.println("Debug peek"+n))
        //.limit(3)cut the stream off, allowing only first 3 elements into brand new list
        .limit(3)
        //.collect() gathers all those 3 final elements into a brand nw list 
        .collect(Collectors.toList());

        System.out.println("Processed numbers "+ processednumbers);


        // flatmap example 
        //Create a complex "list of lists" (nested structure)
        List<List<String>> nestedlist=Arrays.asList(
            Arrays.asList("A","B"),
             Arrays.asList("C","D")
            );
        
            //start a stream on the nested stream 
            List<String> flatList=nestedlist.stream()
            //// .flatMap() takes each internal list and "flattens" it into a single stream of individual letters
              .flatMap(internalList -> internalList.stream() )
              // Collect the flattened stream into a single, standard List
              .collect(Collectors.toList());

              System.out.println("Flattened list"+ flatList); // [A,B,C,D]
    }
    
}
