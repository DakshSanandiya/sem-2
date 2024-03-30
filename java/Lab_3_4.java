import java.util.Scanner;

public class Lab_3_4 {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("enter a number: ");
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) {
                    count++;
                }
            }
        }
        if (count == 0) {
            System.out.println("it's prime number");
        } else {
            System.out.println("it's  not prime number");
        }
    }
}
