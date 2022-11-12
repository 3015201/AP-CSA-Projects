import java.util.Scanner;

public class Main {
//Uses the edison email format
    //Example Student email: 3069420@edison.k12.nj.us
    //Example Staff Email: john.smith@edison.k12.nj.us
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String userName = " ", domain = " ";
        boolean flag = true, flag2 = true;
        System.out.print("Do you wish to run the program? (y/n): ");
        String answer = sc.nextLine();
        if (answer.equalsIgnoreCase("y")){
            flag=true;
        }else if (answer.equalsIgnoreCase("n")){
            flag=false;
        }
        while (flag2==true){

            System.out.print("Enter your email: ");
            String email = sc.nextLine();
            int pos = email.indexOf("@");
            userName = email.substring(0, pos);
            domain = email.substring(pos + 1, email.length()).trim();

            if (!domain.equals("edison.k12.nj.us"))// Validate domain name
            {
                System.out.println("Invalid Domain");
                flag = false;
            }


            if (flag == true && !userName.contains(".") && userName.length() == 7) {// validate student username
                for (int i = 0; i < userName.length(); i++) {
                    if (!(userName.charAt(i) >= '0' && userName.charAt(i) <= '9')) {
                        flag = false;
                        break;
                    } else {
                        flag = true;
                    }
                }
                if (flag == true) {
                    System.out.println("Valid email for student");
                    flag2=false;
                } else {
                    System.out.println("Invalid email for student");
                    flag2=false;
                }

            } else { // validate staff username
                // check for number of "."
                int dotcount = 0;
                for (int y = 0; y < userName.length(); y++) {
                    if (userName.charAt(y) == '.') {
                        dotcount++;
                    }
                }
                if (dotcount != 1) {
                    System.out.println("Invalid username");
                } else {
                    for (int i = 0; i < userName.length(); i++) {
                        if ((userName.charAt(i) >= '0' && userName.charAt(i) <= '9') ||
                                (userName.charAt(i) >= 'A' && userName.charAt(i) <= 'Z') ||
                                (userName.charAt(i) >= 'a' && userName.charAt(i) <= 'z') ||
                                (userName.charAt(i) == '.')) {
                            flag = true;
                        } else {
                            flag = false;
                            break;
                        }

                    }
                    if (flag == false){
                        System.out.println("Invalid email for employee");
                    flag2 = false;
                    }
                    else {
                        System.out.println("Valid email for employee");
                        flag2 = false;
                    }
                }
            }
         }
    }
}
