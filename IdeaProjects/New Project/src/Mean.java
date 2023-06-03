
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

    public class Mean {
        public static void main(String args[]) throws FileNotFoundException {

            File inputfile = new File("C:\\Users\\Bharath\\Downloads\\quiz_numbers.txt"); // Specify the path of the file

            Scanner scan = new Scanner(inputfile);
            int numb = 1;
            int sum = 0;
            int count=0;
            float average;

            while (scan.hasNext()) {  // read the numbers and add them to the value of the sum
                int number = scan.nextInt();
                sum = sum + number;
                count++;
            }
            average=(float)sum/(float)count;
            System.out.println("Mean is :"+average);
        }
    }

