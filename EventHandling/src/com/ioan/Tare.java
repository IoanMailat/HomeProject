package com.ioan;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;


public class Tare extends JFrame {

    private JTextField item1;
    private JTextField item2;
    private JTextField item3;
    private JPasswordField passwordField;

    public Tare(){
        super (" The Title");
        setLayout(new FlowLayout());

        item1= new JTextField(10);
        add(item1);
        item2= new JTextField("enter text here");
        add(item2);
        item3 = new JTextField("needitabil" , 20);
        item3.setEditable(false);
        add(item3);

        passwordField = new JPasswordField("mypass");
        add(passwordField);

        // e timpul pentru a implementa ceva care sa astepte ceva
        TheHandler handler = new TheHandler();
        item1.addActionListener(handler);
        item1.addActionListener(handler);
        item1.addActionListener(handler);
        passwordField.addActionListener(handler);


    }

    //Construim o clasa in interiorul  clasei
    //Am construit obiectul "handler",acel obiect se refera la clasa privata
    // apoi incepem s adaugam obiectul construit fiecarui item,cararo le-am si
    // implementata cate o functionabilitate(dupa enter chiar fac ceva)

    private class TheHandler implements ActionListener{

        // avem nevoie de o clsa care dupa enter va crea un String gol
        public void actionPerformed(ActionEvent event){
            String string = " ";

            if (event.getSource() == item1)
                string = String.format("field 1: %s", event.getActionCommand());

            else if (event.getSource() == item2)
                string = String.format("field 2: %s", event.getActionCommand()) ;

            else if (event.getSource() == item3)
                string = String.format("field 3: %s", event.getActionCommand()) ;

            else if(event.getSource() == passwordField)
                string = String.format("password field is : %s" , event.getActionCommand());

            JOptionPane.showMessageDialog(null, string);

        }


    }


}
