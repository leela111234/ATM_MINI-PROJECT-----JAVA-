import java.util.*;
public class ATM_project{
    public static void main(String[] args){
        int pin = 1234;
        int balance =10000;

        int AddAmount=0;
        int TakeAmount=0;

        String name;

        Scanner sc = new Scanner(System.in);

        // you hava to get the input from user
        System.out.println("Enter your pin number");

        int password = sc.nextInt();


        if(password==pin){
            System.out.println("Enter your name");
            name = sc.next();
            System.out.println("Welcome "+name);

            while(true){
                System.out.println("press 1 to check your balance");
                System.out.println("press 2 to add amount");
                System.out.println("press 3 to take amount");
                System.out.println("press 4 to take resipt");
                System.out.println("press 5 to Exit");

                int option = sc.nextInt();

                switch (option) {
                    case 1:
                       System.out.println("your current balance is"+balance);
                        break;
                    case 2:
                        System.out.println("How much amount did you want to ADD to your account");
                        AddAmount = sc.nextInt();
                        System.out.println("Amount credited sucessfully");
                        balance = balance+AddAmount;
                         break;
                    case 3:
                       System.out.println("How much amount did you want to take");
                       TakeAmount = sc.nextInt();
                       if(TakeAmount>balance){
                        System.out.println("Insufficient balance");
                        System.out.println("you have to enter the amount with in your balance");
                       }
                       else{
                        System.out.println("Your Amount debited sucessfully");
                        balance=balance-TakeAmount;
                       }
                        break;
                    case 4:
                        System.out.println("Welcome to All in one mini ATM");
                        System.out.println("Available balance is"+balance);
                        System.err.println("Amount deposited" + AddAmount);
                        System.out.println("Amount taken"+TakeAmount);
                        System.out.println("Thank you");
                         break;

                    default:
                    System.out.println("press the number below 5");
                        break;
                }
                if(option==5){
                    System.out.println("Thank you");
                    break;
                }

            }


        }
        else{
            System.out.println("Invalid pin number");
        }
    }
}