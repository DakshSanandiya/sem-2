public class Lab_42 {
    public static void main(String[] args) {
        String line = "My Name Is Daksh";
        int v = 0 , c = 0;
        line = line.toLowerCase();
        for(int i = 0;i < line.length();i++){
            char ch = line.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'u' || ch == 'o'){
                v++;
            }else{
                c++;
            }
        }
        System.out.println("Vowel = " + v);
        System.out.println("consonants = " + c);  
    }
}
