package MultiThreading.ThreadJoinMethod;

public class JoinDemo extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Child Thread: " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void main(String[] args) throws InterruptedException {
        JoinDemo jd = new JoinDemo();
        jd.start();
        jd.join();//Joins the child thread with main thread after completing its execution
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Main Thread: " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
