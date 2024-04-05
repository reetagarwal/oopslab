package lab9;

import javax.swing.*;
import java.awt.event.*;


public class SimpleCalculator implements ActionListener{
    JFrame f;
    JLabel a,b,res,head;
    JTextField tf1,tf2,tf3;
    JButton b1,b2,b3,b4;
    SimpleCalculator(){
        f= new JFrame();
        head=new JLabel("Simple Calculator");
        a=new JLabel("Num1");
        b=new JLabel("Num2");
        res=new JLabel("Result");
        tf1=new JTextField();
        tf2=new JTextField();
        tf3=new JTextField();
        tf3.setEditable(false);
        b1=new JButton("+");
        b2=new JButton("-");
        b3=new JButton("*");
        b4=new JButton("/");

        f.setLayout(null);

        head.setBounds(100, 10, 200, 20);
        a.setBounds(30, 50, 80, 20);
        b.setBounds(30, 80, 80, 20);
        res.setBounds(30, 110, 80, 20);
        tf1.setBounds(120, 50, 150, 20);
        tf2.setBounds(120, 80, 150, 20);
        tf3.setBounds(120, 110, 150, 20);
        b1.setBounds(50,200,50,50);
        b2.setBounds(120,200,50,50);
        b3.setBounds(190,200,50,50);
        b4.setBounds(260,200,50,50);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        f.add(head);
        f.add(a);
        f.add(b);
        f.add(res);
        f.add(tf1);
        f.add(tf2);
        f.add(tf3);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(350,370);
        f.setLayout(null);
        f.setVisible(true);
    }


    public void actionPerformed(ActionEvent e) {
        String s1=tf1.getText();
        String s2=tf2.getText();
        int a=Integer.parseInt(s1);
        int b=Integer.parseInt(s2);
        int c=0;
        if(e.getSource()==b1){
            c=a+b;
        }else if(e.getSource()==b2){
            c=a-b;
        } else if (e.getSource()==b3) {
            c=a*b;
        } else if (e.getSource()==b4) {
            c=a/b;
        }
        String result=String.valueOf(c);
        tf3.setText(result);
    }


    public static void main(String[] args) {
        new SimpleCalculator();
    }
}
