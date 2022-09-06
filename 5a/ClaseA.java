

import java.util.Random;

public class ClaseA implements Runnable {
    public void run(){
        while (true){
            Principal.A.acquireUninterruptibly();
            System.out.println("A");
            Principal.B.release();
            try {
                Thread.sleep(new Random().nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
