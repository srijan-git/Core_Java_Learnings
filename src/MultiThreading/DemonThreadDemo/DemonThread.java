package MultiThreading.DemonThreadDemo;

public class DemonThread extends Thread {

    @Override
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("Demon Thread");
        } else {
            System.out.println("Child Thread");
        }
    }

    public static void main(String[] args) {
        System.out.println("Main Thread");
        DemonThread t = new DemonThread();
        t.setDaemon(true);
        t.start();
    }
}
