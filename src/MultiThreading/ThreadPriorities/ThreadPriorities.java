package MultiThreading.ThreadPriorities;

public class ThreadPriorities extends Thread {
    @Override
    public void run() {
        System.out.println("Child Thread Priority: " + Thread.currentThread().getPriority());

    }

    public static void main(String[] args) {
        System.out.println("Main Thread Old Priotiry: " + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
        System.out.println("Main Thread New Priotiry: " + Thread.currentThread().getPriority());
        ThreadPriorities tp = new ThreadPriorities();
        tp.start();

    }
}
