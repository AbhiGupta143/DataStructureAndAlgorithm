import java.util.*;

public class StringA1 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int size = s.nextInt();
    int len = 0;
    String[] array = new String[size];
    for(int i= 0; i<size; i++){
     array[i] = s.next();
     len += array[i].length();
    
    }
    System.out.println(len); 
    s.close();
  }
  }

