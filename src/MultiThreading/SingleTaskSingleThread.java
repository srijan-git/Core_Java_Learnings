package MultiThreading;

public class SingleTaskSingleThread implements Runnable {

    @Override
    public void run() {
        System.out.println("Task is running");
    }

    public static void main(String[] args) { //Main thread(Created by JVM by default)
        //Performing single task using single thread
        SingleTaskSingleThread ba = new SingleTaskSingleThread();//Thread1
        Thread th = new Thread(ba);
        th.start();
        //th.start(); we only create on start()

        //Performing Multiple task using single thread is not possible




    }
}
