import java.awt.*;
import java.awt.event.*;
import java.util.logging.Handler;

class MyTextFrame extends Frame {
    Label l1, l2;
    TextField tf;

    MyTextFrame() {
        super("TextField Demo");

        l1 = new Label("No text is entered yet");
        l2 = new Label("Enter key is not yet hit");
        tf = new TextField(20);
        tf.setEchoChar('*');

        Handler h = new Handler();

        tf.addTextListener(h);
        tf.addActionListener(h);

        setLayout(new FlowLayout());
        add(l1);
        add(tf);
        add(l2);
    }

    class Handler implements TextListener, ActionListener {
        public void textValueChanged(TextEvent te) {
            l1.setText(tf.getText());
        }

        public void actionPerformed(ActionEvent ae) {
            l2.setText(tf.getText());
        }
    }
}

public class AWTTextDemo {
    public static void main(String[] args) {
        MyTextFrame mtf = new MyTextFrame();
        mtf.setSize(400, 400);
        mtf.setVisible(true);

    }
}
