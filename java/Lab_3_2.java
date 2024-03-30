import java.util.Scanner;

public class Lab_3_2 {
    public static void main(String[] args) {
        int tamp;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        tamp = a;
        while (a > 0) {
            int b = a % 10;
            a = a / 10;
            sum = sum * 10 + b;
        }
        if (sum == tamp) {
            System.out.println("it's palindrome");
        } else {
            System.out.println("it's not palindrome");
        }
    }
}
