
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;

 interface Sayable{
    public String say();
}
interface Sayable1{
    public String say(String name1);
}
interface Sayable2{
    double calculateavg(double a ,double b, double c);
}
// custom static method class for refrence to static method 
// public class customestaticclass{
//     public static boolean isEven(int number){
//         return number%2==0;
//     }

 class messagesender{
    public void msgsend(String msg){
        System.out.println("Sending"+msg);

    }
}



public class lambdatest {
    public static void main(String[] args) {
        //single paramater
        // consumer is a fucntional interface which has one ip returns nothinhg
        Consumer<String> greeting = name ->System.out.println("Hello:"+name);
        greeting.accept("Intreview candidate");
        
        //multiple paramater
        //binary operator is a fucntional interface which has 2 ip and returns result
        BinaryOperator<Integer> add=(a,b)->a+b;
        int result=add.apply(10, 5);
        System.out.println("The sum is "+ result);
        
        //return
        // function takes 1 ip and returns one op
        // taking ip string and returning op as integer
        Function <String,Integer> lengthfinder =word ->word.length();
        int length=lengthfinder.apply("Shlok");
        System.out.println("length"+length);
        
        //collection
        // forEach
        List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        numbers.forEach(number ->System.out.println(number));

        List<String> colors=Arrays.asList("red","yellow","green","orange");
        colors.forEach(color->System.out.println(color));
        
        // List<String> colors1=new ArrayList<>();
        // colors1.add("RED");
        // colors1.add("YELLOW");
        // colors1.forEach(color1->System.out.println(color1));

        //no paramater
        Sayable s=()->{
            return "I have nothing to say ";
        };
        System.out.println(s.say());

        // single paramater
        Sayable1 s1 = name1->{
            return "Hello"+ name1;
        };
        System.out.println(s1.say("Shlok"));
 
        //multiple paramater with return
        Sayable2 s2=(a,b,c)->{
            return (a+b+c)/3.0 ;
        };
        System.out.println(s2.calculateavg(10, 20, 30));
        
        // without return 
        Sayable2 s3=(a,b,c)->(a+b+c)/3.0;
        System.out.println(s3.calculateavg(20, 30, 40));

        // multiple statements
        Function<Integer,String> gradechecker = score ->{
            System.out.println("Evaluating score"+score);
            if(score>50) return "pass";
            else return "fail";
        };
        String results=gradechecker.apply(75);
        System.out.println("Final Result: " + results);

        // static method refrence
        // We use a static method reference to point to Java's built-in string-to-integer converter.
        Function <String,Integer> stringtoint=Integer::parseInt;
        int staticresult=stringtoint.apply("100");
        System.out.println("Converted result"+staticresult);

        // // calling custom static refrence
        // Predicate <Integer> evenchecker =customestaticclass::isEven;
        // System.out.println(evenchecker.test(8));

        // instance method refrence 
        messagesender mysender=new messagesender();
        Consumer<String> senderlambda=mysender::msgsend;
        senderlambda.accept("HELLLLLLLOOO");




    }
    
 }
// }
