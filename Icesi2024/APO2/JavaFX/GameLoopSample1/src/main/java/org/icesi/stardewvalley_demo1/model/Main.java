public class Main {


    /**
     * método principal: funciona en su propio hilo
     * @param args
     */
    public static void main(String[] args) {

        //1. CREACIÓN DE LOS HILOS
        //hilos implementado con runnable:
        Thread runnableThread1 = new Thread(new Hilos_Runnable());
        Thread runnableThread2 = new Thread(new Hilos_Runnable());

        //Hilos que extienden de Thread:
        Thread thread1 = new Hilo_Thread();
        Thread thread2 = new Hilo_Thread();

        //2. ARRANQUE DE LOS HILOS
        runnableThread1.start();
        runnableThread2.start();
        thread1.start();
        thread2.start();

        //3. JOIN AL HILO PRINCIPAL
        try {
            runnableThread1.join();
            runnableThread2.join();
            thread2.join();
            thread1.join();
        } catch (InterruptedException e) {
            System.out.println("Error creando y arrancando los hilos desde el main.");
        }
    }


}
