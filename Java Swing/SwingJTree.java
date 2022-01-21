import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import javax.swing.tree.*;
import java.io.*;
import java.util.StringTokenizer;

class MyFrame5 extends JFrame implements TreeSelectionListener {
    JTree tree;
    JLabel label;

    MyFrame5() {
        super("Tree Demo");
        //valid path must be given
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("F:\\Jetbrains IDE Demo");
        File f = new File("F:\\Jetbrains IDE Demo");

        for (File x : f.listFiles()) {
            if (x.isDirectory()) {
                DefaultMutableTreeNode temp = new DefaultMutableTreeNode(x.getName());
                for (File y : x.listFiles()) {
                    temp.add(new DefaultMutableTreeNode(x.getName()));
                }
                root.add(temp);
            } else
                root.add(new DefaultMutableTreeNode(x.getName()));
        }

        tree = new JTree(root);
        label = new JLabel("No Files Selected");

        tree.addTreeSelectionListener(this);
        JScrollPane sp = new JScrollPane(tree);

        add(sp, BorderLayout.CENTER);
        add(label, BorderLayout.SOUTH);

    }

    @Override
    public void valueChanged(TreeSelectionEvent e) {
        label.setText(e.getPath().toString());
    }


}

public class SwingJTree {
    public static void main(String[] args) {
        MyFrame5 mf5 = new MyFrame5();
        mf5.setSize(500, 500);
        mf5.setVisible(true);
        mf5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
