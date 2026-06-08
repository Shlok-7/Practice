
import java.util.*;


/*
class stringtest{
    public static void main(String[] args) {
        String name="Shlok";
        name=name+"Lawand"; // this creats new string in mem it doesnt change the original 
        System.out.println(name);

        // stringbuilder
        StringBuilder sb=new StringBuilder("Hello");
        for(int i=1;i<=3;i++){
        // This modifies the existing text in memory. Much faster!
            sb.append("World");
        }
        System.out.println(sb.toString());

        // stringbuffer
        StringBuffer sb1=new StringBuffer("Hello");
        for (int i = 0; i < 10; i++) {
            sb1.append("JAVA"); 
        }
        System.out.println(sb1.toString());
    }
}
*/

// string tokenzier 
// parsing
// formating
// primitve wrappers
/*
class stringtest{
    public static void main(String[] args) {
        String csv=("Apple,50,Red");
        String input="500";
        String item="Coffee";
        double itemamt =4.5;

        // tokenization
        StringTokenizer st =new StringTokenizer(csv, ",");
        while(st.hasMoreTokens()){
            System.out.println("Tokens "+st.nextToken());
        }
        
        // parsing
        int price=Integer.parseInt(input);
        System.out.println(price+=50);

        //formating
        String bill=String.format("You bought a %s for $%.2f",item,itemamt);
        System.out.println(bill);

        // autoboxing
        Integer myno=5;
        //unboxing
        int mathresult=myno+10;
        System.out.println(mathresult);
    }
}
*/


// generic and nongeneric
//collections
// class stringtest{
//     public static void main(String[] args) {
//         // nongeneric
//         ArrayList badList=new ArrayList();
//         badList.add("Hello");
//         badList.add(100);
//         System.out.println(badList);

//         //generic 
//         ArrayList<String> goodList=new ArrayList<>();
//         goodList.add("Hello");
//         System.out.println(goodList);

//         // arraylist(ordered ,allow duplicates )
//         List<String> todo=new ArrayList<>();
//         todo.add("Study");
//         todo.add("Study"); // allowed
//         todo.add("JAVA");

//         //set (unordered, no duplicates)
//         Set<String> fingerprints=new HashSet<>();
//         fingerprints.add("Fingerprint1");
//         fingerprints.add("Fingerprint2");
//         fingerprints.add("Fingerprint2");// ignored the set size still remain 2

        
//         System.out.println("ToDos: " + todo + "\nUnique: " + fingerprints );

//         // Map(key,value )
//         Map<String,Integer> address=new HashMap<>();
//         address.put("Shlok", 12345);
//         address.put("Ram", 6789);
//         System.out.println("Details:"+address.get("Shlok"));

//         Iterator<String> iterator=todo.iterator();
//         while(iterator.hasNext()){
//             String dos=iterator.next();
//             if(dos.equals("Study")){
//                 iterator.remove();
//             }
//         }
//         System.out.println(todo);
//     }
// }
