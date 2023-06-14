package MultiThreading;

//Performing Multiple task using multiple Threads
class MyThread1 implements Runnable {
    @Override
    public void run() {
        System.out.println("Task 1");
    }

}

class MyThread2 implements Runnable {
    @Override
    public void run() {
        System.out.println("Task 2");
    }
}

public class MultiTaskMultiThreads { //Main thread
    public static void main(String[] args) {
        myThread1 mt1 = new myThread1();
        Thread th1 = new Thread(mt1, "Thread 1");
        th1.start();

        MyThread2 mt2 = new MyThread2();
        Thread th2 = new Thread(mt2, "Thread 2");
        th2.start();
    }
}
