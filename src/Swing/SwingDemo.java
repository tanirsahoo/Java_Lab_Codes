package Swing;

import javax.swing.* ;
public class SwingDemo {
    SwingDemo() {
        JFrame obj = new JFrame("Tanir Sahoo");
        obj.setSize(275, 100);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel x = new JLabel("Hell World") ;
        obj.add(x) ;
        obj.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                new SwingDemo();
            }
        }) ;
    }
}