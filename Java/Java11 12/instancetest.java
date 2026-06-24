public class instancetest {
    public static void main(String[] args) {

        // Create a generic Object variable that currently holds a String
        Object genericData="Hello java";

        // --- THE OLD WAY (Pre-Java 16) ---
        // Step 1: Check if it's a string
        if (genericData instanceof String) {
            // Step 2: Manually create a new variable and force a cast (annoying!)
            String oldWayString = (String) genericData;
            // Step 3: Finally use the string method
            System.out.println("Old way length: " + oldWayString.length());
        }

        // --- THE NEW WAY (Pattern Matching) ---
        // Combine the check, the variable creation, and the cast all in one line!
        if(genericData instanceof String s){
            // Immediately use the perfectly typed variable
            System.out.println("New way length:"+s.length());
        }

        // --- ADVANCED: Combining with AND (&&) ---
        // The compiler is smart enough to know newWayString exists before evaluating the right side of the &&
        if(genericData instanceof String s && s.startsWith("Hello")){
            System.out.println("Its a string starts with hello");
        }


    }
    
}
