import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame implements ActionListener {
    JLabel l;
    JButton b;
    int count = 0;

    MyFrame() {
        super("Swing Demo");

        l = new JLabel("Clicked " + count + " Times");
        b = new JButton("Click");
        setLayout(new FlowLayout());

        add(l);
        add(b);
        b.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        l.setText("Clicked " + count + " Times");
    }
}

public class SwingDemo {
    public static void main(String[] args) {
        MyFrame mf = new MyFrame();
        mf.setVisible(true);
        mf.setSize(500, 500);
        mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
