import java.lang.*;

public class Map1 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = new int[6];
        int[] arr3 = new int[6];
        int[] arr4= new int[6];
        /*
        //Double the value of elements of arr1 and store that value in arr2
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = 2 * arr1[i];
        }*/

        arr2=map(new Dbl(),arr1);
        //Square the value of elements of arr1 and store that value in arr3
       /* for (int i = 0; i < arr3.length; i++) {
            arr3[i] = arr1[i] * arr1[i];
        }*/
        arr3=map(new Sqr(),arr1);
        arr4=map(new Function(){
            @Override
            public int apply(int a) {
                return 3*a;
            }
        },arr1);
        Map1.printArray(arr1);
        printArray(arr2);
        printArray(arr3);
        printArray(arr4);

    }


    public static void printArray(int[] arr) {

        for (int j : arr) {
            System.out.println(j);

        }
    }

    public static int[] map(Function F, int[] arr)
    {
        int[]arr1=new int[arr.length];
for(int i=0;i<arr.length;i++) {
    arr1[i] = F.apply(arr[i]);


}
    return arr1;}
}
interface Function
        {
public int apply(int a);
        }

class Dbl implements Function
        {
            public int apply(int a)
        {return 2*a;

        }
        }

class Sqr implements Function
{
    public int apply(int a)
    {return a*a;

    }
}