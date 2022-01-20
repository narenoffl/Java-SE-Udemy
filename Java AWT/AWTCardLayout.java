import java.awt.*;
import java.awt.event.*;


class MyCardFrame extends Frame implements ItemListener {
    Button b1, b2, b3;

    TextField t1, t2, t3;

    Panel p1;
    Panel p2;
    Panel cp;

    Panel mains;

    Checkbox c1, c2;

    CardLayout cl;

    public MyCardFrame() {
        super("CardLayout Demo");

        CheckboxGroup cg = new CheckboxGroup();


        c1 = new Checkbox("One", true, cg);
        c2 = new Checkbox("Two", false, cg);

        c1.addItemListener(this);
        c2.addItemListener(this);


        b1 = new Button("One");
        b2 = new Button("Two");
        b3 = new Button("Three");

        t1 = new TextField(10);
        t2 = new TextField(10);
        t3 = new TextField(10);

        cp = new Panel();
        cp.add(c1);
        cp.add(c2);

        p1 = new Panel();
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);

        p2 = new Panel();
        p2.add(t1);
        p2.add(t2);
        p2.add(t3);

        mains = new Panel();
        cl = new CardLayout();
        mains.setLayout(cl);

        mains.add("One", p1);
        mains.add("Two", p2);

        add(cp, BorderLayout.NORTH);
        add(mains, BorderLayout.CENTER);


    }

    public void itemStateChanged(ItemEvent ie) {
        if (c1.getState())
            cl.first(mains);
        else
            cl.last(mains);

    }
}

public class AWTCardLayout {
    public static void main(String[] args) {
        MyCardFrame mc = new MyCardFrame();
        mc.setSize(500, 500);
        mc.setVisible(true);

    }
}
