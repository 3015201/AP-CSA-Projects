import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Declare Scanner
        double num1, num2, num3, num4, num5, average = 0;
        int averageRounded;
        boolean flag= true;

        //Task1
        do
        {
            //User Input
            System.out.println("Enter number 1: ");
            num1 = sc.nextDouble();
            System.out.println("Enter number 2: ");
            num2 = sc.nextDouble();
            System.out.println("Enter number 3: ");
            num3 = sc.nextDouble();
            System.out.println("Enter number 4: ");
            num4 = sc.nextDouble();
            System.out.println("Enter number 5: ");
            num5 = sc.nextDouble();

            if (num1 > 0 && num2 >0 && num3 > 0 && num4 > 0 && num5 >0){ //Check negative{
                average = (num1+num2+num3+num4+num5)/5;
                System.out.println("Unrounded Average: "+average);
                averageRounded = (int)(average + 0.5);
                System.out.println("Rounded Average: "+averageRounded);
                flag = false;
            }
        else {
            flag= true;
            System.out.print("Negative detected!, please try again with a positive :)"+"\n");
        }

        } while (flag);


        //Task 2
        do
        {
            //User Input
            System.out.println("Enter number 1: ");
            num1 = sc.nextDouble();
            System.out.println("Enter number 2: ");
            num2 = sc.nextDouble();
            System.out.println("Enter number 3: ");
            num3 = sc.nextDouble();
            System.out.println("Enter number 4: ");
            num4 = sc.nextDouble();
            System.out.println("Enter number 5: ");
            num5 = sc.nextDouble();

            if (num1 < 0 && num2 < 0 && num3 < 0 && num4 < 0 && num5 < 0){ //Check negative{
                average = (num1+num2+num3+num4+num5)/5;
                System.out.println("Unrounded Average: "+average);
                averageRounded = (int)(average - 0.5);
                System.out.println("Rounded Average: "+averageRounded);
                flag = false;
            }
            else {
                flag= true;
                System.out.print("Positive detected!, please try again with a negative :)"+"\n");
            }

        } while (flag);

        sc.close(); //Memory Save
    }
}
