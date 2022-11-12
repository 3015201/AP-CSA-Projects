import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String input=" ";
       boolean flag= true;
       System.out.println("Enter your word");
       input = sc.nextLine();
       input = input.toUpperCase();

       for (int i=0; i<input.length(); i++) {
           if (!(input.charAt(i) == 'N' || input.charAt(i) == 'U'||input.charAt(i) == 'M'||
                   input.charAt(i) == 'B'||input.charAt(i) == 'E'||input.charAt(i) == 'R'))
           {
               flag= false;
               break;
           }
       }
       if(flag)
           System.out.println("VALID");
       else
           System.out.println("INVALID");


       sc.close();
   }
}
