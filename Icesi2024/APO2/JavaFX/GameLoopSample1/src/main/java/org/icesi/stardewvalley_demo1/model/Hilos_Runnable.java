import java.util.concurrent.*;

public class Hilos_Runnable implements  Runnable{


    @Override
    /**
     * lógica del hilo o tarea
     */
    public void run() {
        for(int i=0; i<100; i++){
            System.out.println("Hilo "+ Thread.currentThread().threadId() + ", iteración "+i);

        }
        System.out.println("Hilo "+ Thread.currentThread().threadId() + "Finalizado");
    }
}
