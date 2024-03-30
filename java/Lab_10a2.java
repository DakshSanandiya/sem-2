import java.io.*;

public class Lab_10a2 {
    public static void main(String[] args) {
        int line = 0 , count = 0;
        try {
            FileInputStream f = new FileInputStream("Daksh.txt");
            while ((line = f.read()) != -1) {
                System.out.print((char)line);
                count++;
            }
            System.out.println("");
            System.out.println(count);
        } catch (Exception e) {
            System.out.println(e);
        }
    }   
}