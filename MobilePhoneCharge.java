import java.util.Scanner;
public class MobilePhoneCharge {
    public static void main(String[] args) {
        double r, c=0, p;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the customer code (r,c,p): ");
        String code = sc.next();
        if (!(code.equalsIgnoreCase("R")||code.equalsIgnoreCase("C")||code.equalsIgnoreCase("P")))
        {
            System.out.println("Invalid Code");
        }
        else {
            System.out.print("Enter the number of minutes: ");
            int minutes = sc.nextInt();
            code = code.toUpperCase();
            if (minutes > 0 && minutes <10080) {

                if (code.equals("R")) {
                    if (minutes >= 60) {
                        minutes = minutes - 60;
                        r = (minutes * 0.10) + 5;
                    } else {
                        r = 5.00;
                    }
                    System.out.println("The bill is " + r);
                } else if (code.equals("C")) {
                    if (minutes <= 300) {

                        c = minutes * 0.20;
                    } else {
                        minutes = minutes - 300;
                        c = (0.15 * minutes) + 60;
                    }
                    System.out.println("The bill is " + c);
                } else if (code.equals("P")) {
                    if (minutes < 500) {
                        p = (0.06 * minutes) + 10;
                    } else {
                        p = (0.04 * minutes) + 10;
                    }

                    System.out.println("The bill is " + p);
                }
            }
            else
                System.out.println("invalid minutes");
        }
    }
}