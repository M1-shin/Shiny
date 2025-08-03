package Banking;
import java.util.Scanner;

public class BankingClass {
    int accountNo = 10001;
    int pin = 1000;
    
    public boolean verifyAccount(int acc, int pn){
            if(acc == accountNo && pn == pin){
                return true;
            }else{
                return false;
            }
    }
}