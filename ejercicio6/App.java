package guia.semaforo.ejercicio6;
import java.util.concurrent.Semaphore;




public class App {
    static Semaphore A = new Semaphore(1);
    static Semaphore B = new Semaphore(2);


    public static void main(String[] args) {
        GlobalVariables variablesGlobales = new GlobalVariables();
        
        new Thread(new n1(variablesGlobales)).start();
        new Thread(new n2(variablesGlobales)).start();
    }
}
