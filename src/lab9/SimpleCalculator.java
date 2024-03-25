package lab9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends JFrame implements ActionListener {

    private JTextField inputField1, inputField2, resultField;
    private JButton addButton, subtractButton, clearButton;
    private char operator;

    public SimpleCalculator() {
        super("Simple Calculator");

        // Text fields for input and result
        inputField1 = new JTextField(10);
        inputField2 = new JTextField(10);
        resultField = new JTextField(10);
        resultField.setEditable(false);  // Disable editing result field

        // Buttons
        addButton = new JButton("ADD");
        subtractButton = new JButton("SUB");
        clearButton = new JButton("CLEAR");

        // Add ActionListeners to buttons
        addButton.addActionListener(this);
        subtractButton.addActionListener(this);
        clearButton.addActionListener(this);

        // Layout using GridBagLayout
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        // Input fields (GridX, GridY, width, height, weightX, weightY, insets)
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 2;
        panel.add(inputField1, c);

        c.gridy = 1;
        panel.add(inputField2, c);

        // Result field
        c.gridy = 2;
        panel.add(resultField, c);

        // Buttons (GridX, GridY, width, height)
        c.gridwidth = 1;
        c.gridy = 3;
        panel.add(addButton, c);

        c.gridx = 1;
        panel.add(subtractButton, c);

        c.gridx = 2;
        panel.add(clearButton, c);

        add(panel);

        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();

        if (clickedButton == clearButton) {
            // Clear all fields
            inputField1.setText("");
            inputField2.setText("");
            resultField.setText("");
            operator = '\0'; // Reset operator
        } else {
            try {
                double num1 = Double.parseDouble(inputField1.getText());
                double num2 = Double.parseDouble(inputField2.getText());

                if (clickedButton == addButton) {
                    operator = '+';
                } else if (clickedButton == subtractButton) {
                    operator = '-';
                }

                double result = calculate(num1, num2, operator);
                resultField.setText(String.valueOf(result));
            } catch (NumberFormatException ex) {
                // Handle invalid input (optional: show error message)
                System.err.println("Invalid input: Please enter numbers only.");
            }
        }
    }

    private double calculate(double num1, double num2, char operator) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            default:
                // Handle unexpected operator (optional: throw an exception)
                return 0;
        }
    }

    public static void main(String[] args) {
        new SimpleCalculator();
    }
}