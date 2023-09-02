package ru.otus.java.basic.lesson13.oop4.windows;

import ru.otus.java.basic.lesson13.oop4.interfaces.Closeable;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

public class FormApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello");
        FlowLayout flowLayout = new FlowLayout();
        frame.getContentPane().setLayout(flowLayout);
        frame.setSize(400, 400);

        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        frame.getContentPane().add(button1);
        frame.getContentPane().add(button2);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(1);
            }
        });

        // public class FormApp$1 implements ActionListener {
        //   @Override
        //   public void actionPerformed(ActionEvent e) {
        //     System.out.println(1);
        //   }
        // }
        // FormApp$1 a = new FormApp$1();
        // button1.addActionListener(a);

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(2);
            }
        });

        frame.setVisible(true);


    }
}
