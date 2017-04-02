package com.ioan;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Created by Nelutzu on 4/1/2017.
 */
public class Apple extends JFrame {
    private JLabel item1;

    public Apple(){
        super ("The title bar");
        setLayout( new FlowLayout());

        item1 = new JLabel("This is a sentencew ");
        item1.setToolTipText("This is gona show up an hover");
        // we want to add the item to the window
        add(item1);

    }



}
