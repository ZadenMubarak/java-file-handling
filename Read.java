import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read{

    public static void main(String[] args) {
        // Read a file

        try {
            File myobj = new File("cmd.txt");
            Scanner myreader = new Scanner(myobj);
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error: " + e.getMessage());
        }

       
    }
}