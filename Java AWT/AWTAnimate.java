import java.awt.*;
import java.awt.event.*;

class MyAnimateFrame extends Frame implements Runnable {
    int x, y, tx, ty;

    MyAnimateFrame() {
        super("Animation AWT");
        x = 100;
        y = 100;
        tx = ty = 1;

        Thread t = new Thread(this);
        t.start();

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

    }

    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(x, y, 50, 50);

    }

    public void run() {
        while (true) {
            x += tx;
            y += ty;

            if (x < 0 || x > 450)
                tx = tx * -1;
            if (y < 20 || y > 350)
                ty = ty * -1;
            repaint();

            try {
                Thread.sleep(5);
            } catch (Exception e) {
            }
        }

    }

}

public class AWTAnimate {
    public static void main(String[] args) {
        MyAnimateFrame animate = new MyAnimateFrame();
        animate.setSize(600, 600);
        animate.setVisible(true);
    }
}
