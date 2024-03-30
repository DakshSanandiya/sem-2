import java.util.Scanner;
class Squaredemo {
    void area(int l,int b){
        double area=l*b;
        System.out.println(area);
    }
}
    public class Square {
    public static void main(String[] args) {
        Squaredemo c = new Squaredemo();
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        c.area(l, b);
    }
    
}
