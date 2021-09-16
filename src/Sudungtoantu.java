import java.util.Scanner;

public class Sudungtoantu {
    public static void main(String[] args) {
        float  width;
        float height;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter with: ");
        width = sc.nextFloat();
        System.out.println("enter height: ");
        height = sc.nextFloat();
        float area = width * height;
        System.out.println("area is: "+area);
    }
}
