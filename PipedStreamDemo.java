import jdk.internal.util.xml.impl.Input;

import java.io.*;

class Producer extends Thread {
    OutputStream os;

    public Producer(OutputStream o) {
        os = o;
    }

    public void run() {
        int count = 1;
        while (true) {
            try {
                os.write(count);
                os.flush();

                System.out.println("Producer " + count);
                System.out.flush();

                Thread.sleep(10);
                count++;
            } catch (Exception e) {
            }
        }
    }
}

class Consumer extends Thread {
    InputStream is;

    public Consumer(InputStream i) {
        is = i;
    }

    public void run() {
        int x;
        while (true) {
            try {
                x = is.read();

                System.out.println("Consumer " + x);
                System.out.flush();
                Thread.sleep(10);
            } catch (Exception e) {
            }
        }
    }
}

public class PipedStreamDemo {
    public static void main(String[] args) {
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();

        Producer pc = new Producer(pos);
        Consumer cos = new Consumer(pis);

        pc.start();
        cos.start();
    }
}
