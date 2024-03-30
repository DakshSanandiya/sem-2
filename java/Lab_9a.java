class Even implements Runnable {
    public void run() {
            for (int i = 0; i <= 20; i++) {
                if (i % 2 == 0) {
                    System.out.print(" " + i);
                }
                try {
                    Thread.sleep(1000);
                }catch(Exception e){
                    e.printStackTrace();
                }
        }
    }
}
class Odd implements Runnable {
    public void run() {
            for (int i = 0; i <= 20; i++) {
                if (i % 2 != 0) {
                    System.out.print(" " + i);
                }
                try {
                    Thread.sleep(1000);
                }catch(Exception e){
                    e.printStackTrace();
                }
        }
    }
}
public class Lab_9a {
    public static void main(String[] args) {
        Odd o = new Odd();
        Thread t1 = new Thread(o);
        
        Even e = new Even();
        Thread t2 = new Thread(e);

        t1.start();
        t2.start();
    }
}