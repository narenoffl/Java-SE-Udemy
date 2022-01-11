class ThreadData {
    int value;
    boolean flag = true;

    synchronized public void set(int v) {
        while (flag != true) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        value = v;
        flag = false;
        notify();
    }

    synchronized public int get() {
        int x = 0;
        while (flag != false) {
            try {
                wait();
            } catch (Exception e) {
            }
            ;
        }
        x = value;
        flag = true;
        notify();

        return x;
    }
}

class Producer extends Thread {
    ThreadData data;

    public Producer(ThreadData d) {
        data = d;
    }

    public void run() {
        int count = 1;
        while (true) {
            data.set(count);
            System.out.println("Producer " + count);
            count++;
        }
    }
}

class Consumer extends Thread {
    ThreadData data;

    public Consumer(ThreadData d) {
        data = d;
    }

    public void run() {
        int value;
        while (true) {
            value = data.get();
            System.out.println("Consumer " + value);
        }
    }
}

public class InterThread {
    public static void main(String[] args) {
        ThreadData td = new ThreadData();

        Producer p = new Producer(td);
        Consumer c = new Consumer(td);

        p.start();
        c.start();

    }
}
