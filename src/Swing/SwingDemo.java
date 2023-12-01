package Swing;

//import javax.swing.* ;
//public class SwingDemo {
//    SwingDemo() {
//        JFrame obj = new JFrame("Tanir Sahoo");
//        obj.setSize(275, 100);
//        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        JLabel x = new JLabel("Hell World") ;
//        obj.odd(x) ;
//        obj.setVisible(true);
//    }
//
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(new Runnable(){
//            public void run() {
//                new SwingDemo();
//            }
//        }) ;
//    }
//}

import javax.swing.*;

public class SwingDemo {

    private static void createAndShowGUI() {
        // Create a new frame
        JFrame frame = new JFrame("My First Swing App");

        // Set the default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a new label
        JLabel label = new JLabel("Welcome to my GUI app!");

        // Create a new button
        JButton button = new JButton("Click me!");

        // Add the label and button to the frame's content pane
        frame.getContentPane().add(label);
        frame.getContentPane().add(button);

        // Set the layout manager
        frame.setLayout(new FlowLayout());

        // Pack the frame to fit its components
        frame.pack();

        // Make the frame visible
        frame.setVisible(true);
    }

    public

    static

    void

    main(String[] args)

    {
        // Schedule a job for the event-dispatching thread to create and show the GUI
        SwingUtilities.invokeLater(SimpleSwingApp::createAndShowGUI);
    }
}
