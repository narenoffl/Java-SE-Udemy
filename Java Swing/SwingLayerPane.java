import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class MyFrame6 extends JFrame implements ActionListener {
    JLayeredPane lp;
    JRadioButton r1, r2, r3;
    JLabel l1, l2, l3, l4;

    MyFrame6() {
        super("Layered Demo");

        r1 = new JRadioButton("Red");
        r2 = new JRadioButton("Green");
        r3 = new JRadioButton("Blue", true);
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);

        r1.addActionListener(this);
        r2.addActionListener(this);
        r3.addActionListener(this);

        JPanel p1 = new JPanel();
        p1.add(r1);
        p1.add(r2);
        p1.add(r3);

        l1 = new JLabel("Red");
        l1.setBounds(10, 10, 200, 200);
        l1.setBackground(Color.red);
        l1.setOpaque(true);

        l2 = new JLabel("Green");
        l2.setBounds(50, 50, 250, 250);
        l2.setBackground(Color.green);
        l2.setOpaque(true);

        l3 = new JLabel("Blue");
        l3.setBounds(70, 70, 300, 300);
        l3.setBackground(Color.blue);
        l3.setOpaque(true);

        l4 = new JLabel("b");
        l4.setBounds(100, 100, 150, 150);
        l4.setBackground(Color.black);
        l4.setOpaque(true);


        lp = new JLayeredPane();
        lp.add(l1, new Integer(0));
        lp.add(l2, new Integer(1));
        lp.add(l3, new Integer(2));

        lp.add(l4, new Integer(3));

        add(p1, BorderLayout.NORTH);
        add(lp, BorderLayout.CENTER);

        addMouseMotionListener(new MouseAdapter() {
            public void mouseMoved(MouseEvent me) {
                l4.setLocation(me.getX(), me.getY());
            }
        });

    }


    public void actionPerformed(ActionEvent e) {
        if (r1.isSelected())
            lp.setLayer(l4, 1);
        if (r2.isSelected())
            lp.setLayer(l4, 2);
        if (r3.isSelected())
            lp.setLayer(l4, 3);
    }

}

public class SwingLayerPane {
    public static void main(String[] args) {
        MyFrame6 mf6 = new MyFrame6();
        mf6.setSize(800, 800);
        mf6.setVisible(true);

        mf6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
