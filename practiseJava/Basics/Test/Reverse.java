import java.util.*;
public class Reverse {

    

public static void main(String[] args) {
    System.out.println("enter name of string to be reversed");
    Scanner sc = new Scanner(System.in);
    String s;
   s= sc.next();
    
   
    int len = s.length();
    String rev ="";
    for(int i=len-1;i>=0;i--)
    {
        rev = rev+s.charAt(i);
    }
    System.out.println(rev);

}
};
/*
 * 
 * String sf = new StringBuffer(s);
 * System.out.println(sf.reverse());
 */