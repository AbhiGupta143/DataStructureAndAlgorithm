import java.util.*;

public class StringA2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("ENter the string : ");
    String orgstr = sc.next();
    String repstr =" ";
   
     for(int i = 0; i<orgstr.length(); i++){
      if(orgstr.charAt(i) == 'e'){
       repstr += 'i';
        }
        else{
            repstr += orgstr.charAt(i);
        }
     }
     System.out.println(repstr);
  }    
}
