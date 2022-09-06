package guia.semaforo.ejercicio6;

import java.util.Random;

public class n1 implements Runnable{

    private GlobalVariables value;
    public n1(GlobalVariables newValues){
        value = newValues;
    }

    public void run (){
        while( value.top > 0){
            App.B.acquireUninterruptibly();
            System.out.println("the number top " +value.top);
            value.top = value.top - 1;
            App.A.release();
            try {
                Thread.sleep(new Random().nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("the number is " +value.down);
    }
}
