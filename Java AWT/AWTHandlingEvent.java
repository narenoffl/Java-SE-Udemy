import java.awt.*;
import java.awt.event.*;

class MyHandlingFrame extends Frame {
    TextField tf;
    Button b;
    int count = 0;

    MyHandlingFrame() {
        super("Event Handling Demo");

        tf = new TextField("0", 20);
        b = new Button("Click");

        setLayout(new FlowLayout());
        add(tf);
        add(b);

        b.addActionListener((ActionEvent ae) -> {
            count++;
            tf.setText(String.valueOf(count));
        });


    }

}

public class AWTHandlingEvent {
    public static void main(String[] args) {
        MyHandlingFrame mh = new MyHandlingFrame();
        mh.setSize(500,500);
        mh.setVisible(true);
    }
}
