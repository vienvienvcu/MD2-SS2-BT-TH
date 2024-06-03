import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        double money = 1.0;  // tien gui
        int month = 1;   // hang gui
        double interestRate = 1.0; // ty le lai suat
        Scanner input = new Scanner(System.in);
        System.out.println("enter investment amount: ");
        money = input.nextDouble();
        System.out.println("enter number of months: ");
        month = input.nextInt();
        System.out.println("enter annual interest rate in percentage: ");
        interestRate = input.nextDouble();
        double totalInterest = 0;
        for (int i = 0; i< month; i++){
            totalInterest += money * (interestRate/100)/12 * month;
        }
        System.out.println("total of interest: " + totalInterest);
    }
}
