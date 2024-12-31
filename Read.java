import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read{

    public static void main(String[] args) {

        //reading from files in java

        try {
            File myobj = new File("cmd.txt");
            Scanner myreader = new Scanner(myobj);

            while (myreader.hasNextLine()){
                String data = myreader.nextLine();
                System.out.println(data);
            }
            myreader.close();
            
        } catch (FileNotFoundException e) {

            //functionality toalert you that the file enterd does not exist

            System.out.println("Error");
            e.printStackTrace();
        }

       
    }
}