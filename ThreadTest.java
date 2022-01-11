class MyRunnable implements Runnable {
    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i + "Hello");
            i++;
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        MyRunnable ru = new MyRunnable();
        Thread th = new Thread(ru);
        //Thread mainThread = Thread.currentThread();
        th.start();
        //Thread.yield();
        int i = 1;
        while (true) {
            System.out.println(i + "World");
            i++;
        }
    }
}
