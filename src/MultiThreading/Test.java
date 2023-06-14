package MultiThreading;

public class Test extends Thread {

    @Override
    public void run() {
        Thread.currentThread().setName("Srijan");
        System.out.println("Thread is running: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Test t = new Test(); //Thread Created
        System.out.println(t.isAlive());
        t.start();//Start runnable //After completing the task, it will be in dead state
        // and can not be used further

        Test t2 = new Test();
        t2.start(); //We can not call a dead thread we can create a new Thread like t2.start()
        System.out.println(t2.isAlive());
    }
}
