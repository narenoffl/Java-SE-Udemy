class MyData{
    synchronized public void display(String str){
        for(int i=0; i<str.length();i++)
        {
            System.out.println(str.charAt(i));
            try{
                Thread.sleep(100);
            }
            catch(Exception e){}
        }
    }
}

class MyThread1 extends Thread{
    MyData d;
    public MyThread1(MyData d){
        this.d=d;
    }
    public void run()
    {
        d.display("Hello World");
    }
}

class MyThread2 extends Thread{
    MyData d;
    public MyThread2(MyData d){
        this.d=d;
    }
    public void run(){
        d.display("Welcome World");
    }
}

public class SynchronizationDemo {
    public static void main(String[] args) {
        MyData md = new MyData();
        MyThread1 mt1 = new MyThread1(md);
        MyThread2 mt2 = new MyThread2(md);
        mt1.start();
        mt2.start();

    }
}
