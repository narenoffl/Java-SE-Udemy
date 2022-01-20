import java.awt.*;
import java.awt.event.*;

class MyTextAreaFrame extends Frame implements ActionListener {
    TextArea ta;
    TextField tf;
    Label l;
    Button b;

    MyTextAreaFrame() {
        super("TextArea Demo");

        l = new Label("No Text Entered ");
        ta = new TextArea(10, 30);
        tf = new TextField(20);
        b = new Button("Click");

        setLayout(new FlowLayout());

        add(ta);
        add(l);
        add(tf);
        add(b);
        b.addActionListener(this);


    }

    public void actionPerformed(ActionEvent ae) {
        ta.insert(tf.getText(), ta.getCaretPosition());

    }


}

public class AWTTextArea {
    public static void main(String[] args) {
        MyTextAreaFrame mtaf = new MyTextAreaFrame();
        mtaf.setSize(400, 400);
        mtaf.setVisible(true);
    }


}
