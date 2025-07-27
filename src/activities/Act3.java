package activities;
import java.util.Scanner;

public class Act3 {
    
    public static void main(String[] args) {
        System.out.println("Activity 3");
        Scanner sc = new Scanner(System.in);
        
        int num;
        
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        
        if (num==0){
            System.out.println("Inputted number is Zero.");
        }else if (num<0){
            System.out.println(num+" is a negative number.");
        }else{
            System.out.println(num+" is a positive number.");
        }
    }
}
