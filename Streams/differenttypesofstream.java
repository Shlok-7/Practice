
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class differenttypesofstream {
    public static void main(String[] args) {
        
        // ---Collection Stream ---
        // Create a standard list of names
        // 1. list.stream
        List<String >list=Arrays.asList("Shlok","Ram");
        List<String> liststream=list.stream().collect(Collectors.toList());
        System.out.println(liststream);

        //2.Stream.of
        Set<String> ofstream=Stream.of("cat","Dog","Bird","cat").collect(Collectors.toSet());
        System.out.println(ofstream);

        //3.Stream.genearte
        List<String> isgenerating=Stream.generate(()->"PING").limit(3).collect(Collectors.toList());
        System.out.println(isgenerating);

        //4. String.iterate
        List<Integer> iterable=Stream.iterate(1, n->n*2).limit(8).collect(Collectors.toList());
        System.out.println(iterable);

        //5.String chars
        IntStream charStream="HELLO".chars();
        charStream.forEach(System.out::println);


    }
    
}
