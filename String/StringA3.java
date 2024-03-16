import java.util.Scanner;

public class StringA3 {
      public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Email : ");
    String orgstr = sc.next();
    String repstr =" ";
   
     for(int i = 0; i<orgstr.length(); i++){
      if(orgstr.charAt(i) == '@'){
       break;
        }
        else{
            repstr += orgstr.charAt(i);
        }
     }
     System.out.println(repstr);
}
}