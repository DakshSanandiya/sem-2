import java.util.*;

public class Lab_2_5 {
    public static void main(String[] args) {
        System.out.println("enter a value of fahrenheit: ");
        Scanner sc = new Scanner(System.in);
        float f = sc.nextInt();
        float c = (f - 32) * 5 / 9;
        System.out.println("ans =" + (c));

    }
}
