

public class Hilo_Thread extends Thread{

    @Override
    public void run() {
        for(int i=0; i<100; i++){
            System.out.println("Hilo "+ Thread.currentThread().threadId() + ", iteración "+i);

        }
        System.out.println("Hilo "+ Thread.currentThread().threadId() + " Finalizado");
    }

}
