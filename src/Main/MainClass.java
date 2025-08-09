package Main;
import java.util.Scanner;
import Banking.BankingClass;
import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        int choice;
        BankingClass bank = null;
        
        System.out.println("HELLO WELCOME TO THE SYSTEM!");
        System.out.println("1. Banking");
        System.out.println("2. Doctors Appointment");
        System.out.println("3. Shopping");
        System.out.print("Enter choice: ");
        choice = sc.nextInt();
        
        switch(choice){
            case 1:
                int attempts = 3;
                int option, resp;
                int addMore;
                ArrayList<BankingClass> accounts = new ArrayList<>(); 

                do {
                    System.out.println("1. Register Account");
                    System.out.println("2. Login Account");
                    System.out.println("3. View All Accounts");
                    System.out.print("Enter Selection: ");
                    option = sc.nextInt();

                    switch (option) {
                        case 1: 
                            do {
                                bank = new BankingClass();
                                System.out.print("Enter Account No.: ");
                                bank.setAccountNo(sc.nextInt());
                                System.out.print("Enter Account Pin: ");
                                bank.setPin(sc.nextInt());
                                accounts.add(bank);
                                System.out.println("Account registered successfully!");
                                System.out.print("Do you want to register another account? (1/0): ");
                                addMore = sc.nextInt();
                                } while (addMore == 1);
                                break;

                        case 2:
                            if (accounts.isEmpty()) {
                                System.out.println("No account registered yet!");
                                break;
                            }
                            System.out.print("Enter your Account No: ");
                            int accountNo = sc.nextInt();
                            System.out.print("Enter your Pin: ");
                            int pin = sc.nextInt();

                            boolean found = false;
                            for (BankingClass acc : accounts) {
                                if (acc.verifyAccount(accountNo, pin)) {
                                    bank = acc;
                                    found = true;
                                    break;
                            }
                            }
                            if (!found) {
                                attempts--;
                                if (attempts == 0) {
                                    System.out.println("Maximum login attempts reached!");
                                    System.exit(0);
                            }
                                System.out.println("INVALID ACCOUNT! Attempts Left: " + attempts);
                            }   
                                else{
                                System.out.println("LOGIN SUCCESSFUL!");
                            }
                            break;

                        case 3:
                            if (accounts.isEmpty()) {
                                System.out.println("No account registered yet.");
                            } else {
                                System.out.println("\nREGISTERED ACCOUNTS");
                                for (BankingClass acc : accounts) {
                                    System.out.println("Account No: " + acc.getAccountNo());
                            }
                            }
                            break;

                        default:
                            System.out.println("Invalid option!");
                            }
                            System.out.print("Do you want to continue? (1/0): ");
                            resp = sc.nextInt();
                            } while (resp == 1);
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