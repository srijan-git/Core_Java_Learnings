package MultiThreading.ThreadYieldDemo;

public class YieldDemo extends Thread {
    @Override
    public void run() {
        //Thread.yield(); //If you want this method to stop and provide chance main threads for execution

        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + "-" + i);
        }
    }

    public static void main(String[] args) {
        YieldDemo t = new YieldDemo();
        t.start();
        Thread.yield(); //If you want main method to stop and provide chance to other threads for execution
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + "-" + i);
        }
    }
}
