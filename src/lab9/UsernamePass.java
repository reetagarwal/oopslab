package lab9;

import javax.swing.*;
import java.awt.*;

public class UsernamePass extends JFrame {

    private JLabel usernameLabel, passwordLabel;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public UsernamePass() {
        super("Login Page");

        usernameLabel = new JLabel("Username:");
        passwordLabel = new JLabel("Password:");
        usernameField = new JTextField(20);
        passwordField = new JPasswordField(20);
        loginButton = new JButton("SUbmit");

        // Arrange the components using a layout manager
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(10, 10, 10, 10);

        c.gridx = 0;
        c.gridy = 0;
        panel.add(usernameLabel, c);

        c.gridx = 1;
        c.gridy = 0;
        panel.add(usernameField, c);

        c.gridy = 1;
        panel.add(passwordLabel, c);

        c.gridx = 1;
        c.gridy = 1;
        panel.add(passwordField, c);

        c.gridy = 2;
        panel.add(loginButton, c);

        // Add the panel to the frame
        add(panel);

        // Set frame properties
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame on the screen
        setVisible(true);
    }

    public static void main(String[] args) {
        new UsernamePass();
    }
}