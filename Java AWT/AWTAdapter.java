import java.awt.*;
import java.awt.event.*;

class MyAdapterFrame extends Frame {
    MyAdapterFrame() {
        super("Adapter Demo");
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}

public class AWTAdapter {
    public static void main(String[] args) {
        MyAdapterFrame maf = new MyAdapterFrame();
        maf.setSize(500, 500);
        maf.setVisible(true);
    }
}
