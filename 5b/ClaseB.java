
import java.util.Random;


public class ClaseB implements Runnable {
    public void run(){
        while (true){
            Principal.B.acquireUninterruptibly();
            System.out.println("B");
            Principal.A.release();
            try {
                Thread.sleep(new Random().nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}