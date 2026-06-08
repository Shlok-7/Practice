
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streampractise {

    public static void main(String[] args) {
        //Create a stream from a list of integers and print only even numbers.
        List<Integer> even = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        // even.stream().filter( n ->n%2==0).forEach(System.out::println);;

        // Use Stream.of() to create a stream of strings and sort them alphabetically.
        Stream.of("Shlok", "Dj", "kk", "AA").sorted().forEach(System.out::println);

        //Generate an infinite stream of random numbers using Stream.generate() and limit it to 10 values.
        Stream.generate(Math::random).limit(10).forEach(System.out::println);

        //Use Stream.iterate() to produce the first 10 Fibonacci numbers.
        Stream.iterate(
                new int[]{0, 1},
                f -> new int[]{f[1], f[0] + f[1]})
                .limit(10)
                .map(f -> f[0])
                .forEach(System.out::println);

    }

}
