import java.awt.*;
import java.awt.event.*;

class MyPaintFrame extends Frame {
    int x = 0, y = 0;

    MyPaintFrame() {
        super("Painting Demo");

        addMouseMotionListener(new MouseAdapter() {
            public void mouseMoved(MouseEvent me) {
                x = me.getX();
                y = me.getY();
                repaint();
            }
        });

    }

    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.setFont(new Font("Luminary", Font.BOLD, 30));
        g.fillOval(x, y, 100, 100);
        g.drawString("Hello", x, y);
    }
}

public class AWTPainting {
    public static void main(String[] args) {
        MyPaintFrame mp = new MyPaintFrame();
        mp.setSize(600, 600);
        mp.setVisible(true);
    }
}
