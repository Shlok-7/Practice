import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class flieStingtest {
    public static void main(String[] args) {

        // use try if hardive might be full or locked 
        try {
        Path myfile=Path.of("sample.txt");
        String texttosave="Hello this is file testing text\n this is the second line";
            // writing
            Files.writeString(myfile, texttosave);
            System.out.println("saved to file succesffully");

            // appending
            Files.writeString(myfile,"\n Append this line to test",StandardOpenOption.APPEND);
            // Reading 
            String read= Files.readString(myfile);
            System.out.println(read); 
          
        } catch (Exception e) {
            System.out.println("An error mesasge occured"+e.getMessage());
        }
    }
    
}
