import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("your weight(in kg)");
        weight = scanner.nextDouble();

        System.out.println("your height(in meter)");
        height = scanner.nextDouble();
        bmi = weight/Math.pow(height, 2);
        System.out.println("%-20.2f%s" +  "bmi" + "Interpretation"+ "\n");
        if (bmi <18) {
            System.out.println("%-20.2f%s" +  "bmi" + "Underweight"+ "\n");
        }else if(bmi < 25.0){
            System.out.println("%-20.2f%s" +  "bmi" + "Normal"+ "\n");
        } else if (bmi < 30.0) {
            System.out.println("%-20.2f%s" +  "bmi" + "Overweight"+ "\n");
        }else {
            System.out.println("%-20.2f%s" +  "bmi" + "Obese"+ "\n");
        }

    }
}

