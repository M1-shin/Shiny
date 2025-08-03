package Main;
import java.util.Scanner;
import Banking.BankingClass;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        int choice;
        
        System.out.println("HELLO WELCOME TO THE SYSTEM!");
        System.out.println("1. Banking");
        System.out.println("2. Doctors Appointment");
        System.out.println("3. Shopping");
        System.out.print("Enter choice: ");
        choice = sc.nextInt();
        
        switch(choice){
            case 1:
                BankingClass bank = new BankingClass();
                int attempts = 0;
                boolean verified = false;

                while(attempts < 3){
                    System.out.print("Enter your Account No: ");
                    int accountNo = sc.nextInt();
                    System.out.print("Enter your Pin: ");
                    int pin = sc.nextInt();
                        if(bank.verifyAccount(accountNo, pin)){
                            System.out.println("Login Successful!");
                            verified = true;
                            break;
                        } else {
                            System.out.println("Invalid! Please try again.");
                            attempts++;
                        }
                }
                if(!verified){
                    System.out.println("Maximum login attempts reached. Access denied.");
                } 
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            default:
                System.out.println("Invalid Selection!");
        }
    }
}