public class stringtest {
    public static void main(String[] args) {

        // isBlank()
        // Create a string that only contains empty space characters
        String trickspace="   \t";
        // Check if the string is blank (only spaces) and print the result
        System.out.println("Is it blank+"+ trickspace.isBlank());


        //strip()
        // Create a string with spaces at both the front and the back
        String messyword="  Hello Java  ";
        // Use strip() to cleanly remove spaces from both ends
        System.out.println("Stripped:"+ messyword.strip()+"'");


        //repeat()
        String dash="-";
        // Repeat the dash 10 times to create a divider line
        System.out.println("Dash:"+ dash.repeat(10));


        //lines()
        // Create a multi-line string using the \n character to simulate pressing Enter
        String poem="Line 1 \n Line 2 \n Line 3 ";
        // Turn the poem into a stream of lines, and print each one with a prefix
        poem.lines().forEach(line ->System.out.println("Read"+line));

    }
    
}
