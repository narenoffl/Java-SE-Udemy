import java.awt.*;

class MyGridFrame extends Frame {
    Button b1, b2, b3, b4, b5, b6;

    public MyGridFrame() {
        super("Grid Layout Demo");

        setLayout(new GridLayout(3, 2));

        b1 = new Button("one");
        b2 = new Button("two");
        b3 = new Button("three");
        b4 = new Button("four");
        b5 = new Button("five");
        b6 = new Button("six");


        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
    }
}

public class AWTGridLayout {
    public static void main(String[] args) {
        MyGridFrame mg = new MyGridFrame();
        mg.setSize(500, 500);
        mg.setVisible(true);
    }
}
