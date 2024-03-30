import java.util.*;

public class Lab_3_1 {
    public static void main(String[] args) {
        System.out.println("enter your marks");
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();

        System.out.println("enter your marks");
        int s2 = sc.nextInt();

        System.out.println("enter your marks");
        int s3 = sc.nextInt();

        System.out.println("enter your marks");
        int s4 = sc.nextInt();

        System.out.println("enter your marks");
        int s5 = sc.nextInt();

        int total;
        float per;
        total = s1 + s2 + s3 + s4 + s5;
        per = total * 100 / 500;

        if (per >= 60) {
            System.err.println("your Per = " + per);
            System.out.println("your division : first");
        } else if (per >= 50 && per < 59) {
            System.err.println("your Per = " + per);
            System.out.println("your division : second");
        } else if (per >= 40 && per < 49) {
            System.err.println("your Per = " + per);
            System.out.println("your division : third");
        } else if (per < 40) {
            System.err.println("your Per = " + per);
            System.out.println("your division : fail");
        }
    }
}