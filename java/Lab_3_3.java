import java.util.Scanner;

public class Lab_3_3 {
    public static void main(String[] args) {
        System.out.println("enter a number : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("enter a number : ");
        int b = sc.nextInt();

        System.out.println("enter a number : ");
        int c = sc.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println("max = " + a);
            } else {
                System.out.println("max = " + c);
            }
        } else {
            if (b > c) {
                System.out.println("max = " + b);
            } else {
                System.out.println("max = " + c);
            }
        }
    }
}
