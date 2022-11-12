import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int input, decNum=0, power=0;
       System.out.print("Enter your binary number: ");
       input = sc.nextInt();
           while (input != 0) {
               decNum += ((input % 10) * Math.pow(2, power));
               input = input / 10;
               power++;
           }
       System.out.println("Decimal Number is "+decNum);
       sc.close();
       }
   }
