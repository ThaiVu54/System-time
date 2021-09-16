import java.sql.SQLOutput;
import java.util.Scanner;

public class Chisocannangcothe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight, height, bmi;
        System.out.print("enter weight (in kilogram): ");
        weight = sc.nextDouble();
        System.out.print("enter height (in meter): ");
        height = sc.nextDouble();
        bmi = weight / Math.pow(height, 2); // binh phuong - Math.pow

        System.out.printf("%20s%s", "bmi", "interpretation\n");

        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "Obese");
    }

}
