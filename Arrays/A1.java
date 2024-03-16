import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
         for(int j=0; j<size; j++){
            arr[j] = sc.nextInt();
         }

           int x= sc.nextInt();

        for(int i = 0; i<arr.length; i++){
            if(arr[i] == x){
 System.out.println("Number found at index : " +i);
            }
           
        }
    }
}
