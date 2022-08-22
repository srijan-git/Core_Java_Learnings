package MultiThreading;


//performing single task using Multiple Thread
class myThread1 implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread Task: " + Thread.currentThread().getName());
    }
}

public class singleTaskMultiThreads {
    public static void main(String[] args) {//Main Thread
        System.out.println("Hello is printed by: " + Thread.currentThread().getName());

        myThread1 mt1 = new myThread1();//thread1
        Thread th1 = new Thread(mt1);
        th1.start();

        myThread1 mt2 = new myThread1();//Thread2
        Thread th2 = new Thread(mt2);
        th2.start();
    }

}
