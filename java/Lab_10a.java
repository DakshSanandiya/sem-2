import java.io.*;

public class Lab_10a {
    public static void main(String[] args) {
        String line;
        int read=0;
        try {
            FileReader fr = new FileReader("Daksh.txt");
            BufferedReader br = new BufferedReader(fr);
            while ((line = br.readLine()) != null) {
                read++;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(read);
    }
}