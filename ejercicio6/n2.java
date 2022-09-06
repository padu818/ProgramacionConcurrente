package guia.semaforo.ejercicio6;

import java.util.Random;


public class n2 implements Runnable {

    private GlobalVariables value;


    public n2(GlobalVariables newValue) {
        value = newValue;
    }

    public void run (){
        while(true){
            App.A.acquireUninterruptibly(2);
            System.out.println("-------------"+ value.top );
            value.down = value.down + 2* value.top - 1;
            App.B.release(2);
            try {
                Thread.sleep(new Random().nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
