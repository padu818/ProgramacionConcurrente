import java.util.concurrent.Semaphore;


public class Principal {
    static Semaphore A = new Semaphore(1);
    static Semaphore B = new Semaphore(2);
    public static void main(String[] args) {
        new Thread(new ClaseA()).start();
        new Thread(new ClaseB()).start();
    }
}