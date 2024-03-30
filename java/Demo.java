import java.util.ArrayList;
public class Demo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // add
        list.add(1);
        list.add(2);
        list.add(3);

        for (int i = 0 ; i < list.size() ; i++ ){
            System.out.println(list.get(i));
        }
        list.add(2,15);
        for (int i = 0 ; i < list.size() ; i++ ){
            System.out.println(list.get(i));
        }
    }
}