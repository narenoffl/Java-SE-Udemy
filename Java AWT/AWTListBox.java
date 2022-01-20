import java.awt.*;
import java.awt.event.*;

class TextBox extends Frame implements ItemListener, ActionListener {
    List l;
    Choice c;
    TextArea ta;

    TextBox() {
        super("ListBox Demo");

        l = new List(4, true);
        c = new Choice();
        ta = new TextArea(20, 30);

        l.add("Monday");
        l.add("TuesDay");
        l.add("Wednesday");
        l.add("Thursday");
        l.add("Friday");
        l.add("Saturday");
        l.add("Sunday");

        c.add("January");
        c.add("February");
        c.add("March");
        c.add("April");

        setLayout(new FlowLayout());
        add(l);
        add(c);
        add(ta);

        l.addItemListener(this);
        c.addItemListener(this);
        l.addActionListener(this);

    }

    public void itemStateChanged(ItemEvent ie) {
        if (ie.getSource() == l)
            ta.setText(l.getSelectedItem());
        else
            ta.setText(c.getSelectedItem());
    }

    public void actionPerformed(ActionEvent ae) {
        String list[] = l.getSelectedItems();

        String txt = "";

        for (String x : list)
            txt += x + "\n";

        ta.setText(txt);

        l.addItem(txt);
    }

}

public class AWTListBox {
    public static void main(String[] args) {
        TextBox tb1 = new TextBox();
        tb1.setSize(400, 400);
        tb1.setVisible(true);
    }
}
