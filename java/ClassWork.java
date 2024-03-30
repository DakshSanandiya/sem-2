import java.util.Scanner;

public class ClassWork {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String temp = sc.nextLine();
        if(temp.trim().equals("Daksh")){
            System.out.println("valid User");
        }
        else{
            System.out.println("invalid User");
        }
    }
}