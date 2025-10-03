import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PracticeProblem {

    public static void main(String[] args) {
        // Test both methods together
        System.out.println("Normal file:");
        System.out.println(readFile("test.txt"));
        
        System.out.println("Backwards file:");
        System.out.println(backwardsReadFile("test.txt"));
    }
    
    // Read file normally
    public static String readFile(String filename) {
        try {
            Scanner scanner = new Scanner(new File(filename));
            String content = "";
            
            while (scanner.hasNextLine()) {
                content += scanner.nextLine() + "\n";
            }
            
            scanner.close();
            return content;
        } catch (FileNotFoundException e) {
            return "File not found!";
        }
    }
    
    // Read file backwards
    public static String backwardsReadFile(String filename) {
        try {
            Scanner scanner = new Scanner(new File(filename));
            String content = "";
            
            // Read file normally first
            while (scanner.hasNextLine()) {
                content += scanner.nextLine() + "\n";
            }
            scanner.close();
            
            // Reverse the string
            String backwards = "";
            for (int i = content.length() - 1; i >= 0; i--) {
                backwards += content.charAt(i);
            }
            
            return backwards;
        } catch (FileNotFoundException e) {
            return "File not found!";
        }
    }
}



