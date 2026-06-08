// Import the Path class to locate files
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

// Define the main class to demonstrate file comparison
public class FileMismatchDemo {
    // Define the main method where the program starts
    public static void main(String[] args) {
        
        // Try block to handle potential hard drive errors automatically
        try {
            // Define the path for the first test file
            Path file1 = Path.of("test1.txt");
            // Define the path for the second test file
            Path file2 = Path.of("test2.txt");
            
            // Create the first file and write some text into it
            Files.writeString(file1, "Java is awesome");
            // Create the second file and write slightly different text into it (notice the 'A')
            Files.writeString(file2, "Java is awesome");
            
            // --- THE CORE FEATURE ---
            // Ask Java to compare the two files and give us the position of the first difference
            long mismatchIndex = Files.mismatch(file1, file2);
            
            // Check if the result is -1, which is Java's secret code for "Perfect Match"
            if (mismatchIndex == -1L) {
                // If it's -1, print that they are identical
                System.out.println("The files are perfectly identical!");
            } else {
                // If it's not -1, print the exact position where they first disagreed
                System.out.println("The files differ at byte position: " + mismatchIndex);
            }
            
            // Clean up: delete the temporary test files from the hard drive
            Files.deleteIfExists(file1);
            // Clean up the second file as well
            Files.deleteIfExists(file2);
            
        } catch (IOException e) {
            // If the hard drive throws an error (like missing permissions), print it here
            System.out.println("A file error occurred: " + e.getMessage());
        }
    }
}