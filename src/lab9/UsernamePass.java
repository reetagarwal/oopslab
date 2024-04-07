package lab9;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UsernamePass {
    JFrame f;
    JLabel head,username,password;
    JTextField user,pass;
    JButton submit;

    public UsernamePass() {
        f=new JFrame();
        head=new JLabel("Login");
        username=new JLabel("Username");
        password=new JLabel("Password");
        user=new JTextField();
        pass=new JTextField();
        submit=new JButton("Submit");

        f.setLayout(null);

        f.add(head);
        f.add(username);
        f.add(password);
        f.add(user);
        f.add(pass);
        f.add(submit);

        head.setBounds(100, 10, 200, 20);
        username.setBounds(30, 50, 80, 20);
        user.setBounds(120, 50, 150, 20);
        password.setBounds(30, 80, 80, 20);
        pass.setBounds(120, 80, 150, 20);
        submit.setBounds(80, 130, 150, 20);

        submit.addActionListener(e -> {

            JOptionPane.showMessageDialog(f, "Registration submitted successfully!");
        });

        f.setSize(300,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {
        new UsernamePass();
    }
}
