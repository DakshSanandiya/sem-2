import java.util.*;

public class Lab_2_3 {
    public static void main(String[] args) {
        float ans = 0;
        System.out.println("enter a number : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("enter a number : ");
        int b = sc.nextInt();

        System.out.println("enter a oparetor: ");
        String s = sc.next();
        if (s.equals("+")) {
            ans = a + b;
        } else if (s.equals("-")) {
            ans = a - b;
        } else if (s.equals("*")) {
            ans = a * b;
        } else if (s.equals("/")) {
            ans = a / b;
        }
        System.out.println(ans);
    }
}
