import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
       String input = " ";
       int length;
       Scanner sc = new Scanner (System.in);
       System.out.println("Enter name") ;
       input = sc.nextLine() ;
       sc.close();
       length = input.length() ;
       System.out.println(input);
       while(length != 0) {
           System.out.print(input.substring(length - 1, length));
           length--;
       }
           System.out.print("");
           length += input.length();
           System.out.print("");
           while(length != 0)
           {
               System.out.print(input.substring(length));
                       length--;
           }
           System.out.println("");
           while (length <input.length()){
               System.out.print(input.substring(length, length + 1));
               length++;
           }
   }
}
