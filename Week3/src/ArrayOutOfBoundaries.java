import java.util.Scanner;
import java.lang.ClassNotFoundException;
public class ArrayOutOfBoundaries {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num;
        int[] arr = new int[100];
        for( int i = 0; i < arr.length ; i++){
            arr[i] = (int) (Math.random() * 100);
        }
        num = scan.nextInt();
        try{
            System.out.println(arr[num]);
        }
        catch(java.lang.ArrayIndexOutOfBoundsException e){
            System.out.println("Out of the bounds");
        }
    }
}
