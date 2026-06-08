
import java.io.FileReader;
import java.io.FileWriter;

class fileio{
    public static void main(String[] args) {
        try {
            //1. Writing a file 
            FileWriter writer =new FileWriter("test.txt");
            writer.write("Hello this is an test file created ");
            writer.close();
            System.out.println("File saved");
            
        } catch (Exception e) {
            System.out.println("Error writing file");
        }
        //2. reading from a file(input)
        try {
            FileReader reader=new FileReader("test.txt");
            int character;
            while ((character = reader.read()) != -1){
                System.out.println((char)character);
            }
            reader.close();
            
        } catch (Exception e) {
            System.out.println("error reading file");
        }
    }
}