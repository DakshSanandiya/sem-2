interface A{
    int a = 10;
    void mA();
}
interface A1 extends A{
    int a1 = 100;
    void mA1();
}
interface A2 extends A{
    int a2 = 1000;
    void mA2();
}
interface A12 extends A1,A2{
    int a12 = 10000;
    void mA12();
}
class B implements A12{
    public void mA(){
        System.out.println(a);
    }
    public void mA1(){
        System.out.println(a1);
    }
    public void mA2(){
        System.out.println(a2);
    }
    public void mA12(){
        System.out.println(a12);
    }
}
public class Lab_5b {
    public static void main(String[] args) {
        B b = new B();
        b.mA();
        b.mA1();
        b.mA2();
        b.mA12();
    }
}