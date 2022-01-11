class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
        setPriority(MAX_PRIORITY);
    }

    public void run()
    {
        int count=1;
        while(true)
        {
            System.out.println(count++);
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}

public class ThreadClassTest {
    public static void main(String[] args) {
        MyThread mth = new MyThread("My Thread 1");
        System.out.println("ID " + mth.getId());
        System.out.println("Name " + mth.getName());
        System.out.println("Priority " + mth.getPriority());
        mth.start();
        mth.interrupt();
        System.out.println("State "+mth.getState());
        System.out.println("Alive "+mth.isAlive());
    }
}
