import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ReadFile {
    public static void main(String args[]) throws FileNotFoundException {

        File inputfile = new File("C:\\Users\\Bharath\\Downloads\\aliceinwonderland.txt"); // specify the path of your file -  Note that C:\\ is used instead of C:\ to specify path
        // Create a scanner
        Scanner scan = new Scanner(inputfile);
        int WordNumber=1;
        // scan lines from the file
        while (scan.hasNext()) {
            String word = scan.next();
            System.out.println(WordNumber+" "+word);
WordNumber++;

        }
    }

}