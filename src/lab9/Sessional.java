package lab9;

import javax.swing.*;

public class Sessional {
    JFrame f;
    JLabel head;
    JButton submit;

    public Sessional() {
        f=new JFrame();
        head=new JLabel("Printing sessional");
        submit=new JButton("Submit");

        f.setLayout(null);

        f.add(head);
        f.add(submit);

        head.setBounds(20,50,150,20);
        submit.setBounds(20,70,100,20);

        submit.addActionListener(e ->{
            JOptionPane.showMessageDialog(f,"Today is sessional");
        });


        f.setSize(200,200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Sessional();
    }
}
