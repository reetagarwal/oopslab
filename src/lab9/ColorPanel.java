package lab9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorPanel implements ActionListener{
    JFrame f;
    JLabel head;
    JButton red,green,blue;

    public ColorPanel() {
        f=new JFrame();
        head=new JLabel("Color Panel");
        red=new JButton("Red");
        green=new JButton("Green");
        blue=new JButton("Blue");

        f.setLayout(null);

        head.setBounds(100, 10, 200, 20);
        red.setBounds(50,50,100,50);
        green.setBounds(50,100,100,50);
        blue.setBounds(50,150,100,50);

        f.add(head);
        f.add(red);
        f.add(green);
        f.add(blue);

        red.addActionListener(this);
        green.addActionListener(this);
        blue.addActionListener(this);

        f.setSize(350,370);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==red){
            f.getContentPane().setBackground(Color.red);
        }
        if(e.getSource()==green){
            f.getContentPane().setBackground(Color.green);
        }
        if(e.getSource()==blue){
            f.getContentPane().setBackground(Color.blue);
        }
    }

    public static void main(String[] args) {
        new ColorPanel();
    }
}
