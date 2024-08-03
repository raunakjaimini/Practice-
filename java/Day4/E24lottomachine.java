import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class E24lottomachine extends JFrame {

    private JPanel panel;
    private JButton generateButton;
    private JLabel resultLabel;
    private JTextField n1, n2, n3, n4, n5;

    public E24lottomachine() {

        setTitle("LOTTO MACHINE");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new JPanel();
        panel.setLayout(new GridLayout(8, 1));
        generateButton = new JButton("Generate Lottery Number: ");
        generateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int number1 = Integer.parseInt(n1.getText());
                int number2 = Integer.parseInt(n2.getText());
                int number3 = Integer.parseInt(n3.getText());
                int number4 = Integer.parseInt(n4.getText());
                int number5 = Integer.parseInt(n5.getText());
                if (isValidInput(number1) && isValidInput(number2) &&
                        isValidInput(number3) && isValidInput(number4) &&
                        isValidInput(number5)) {
                    int randomIndex = (int) (Math.random() * 5);
                    int[] numbers = {number1, number2, number3, number4, number5};
                    int randomNumber = numbers[randomIndex];
                    resultLabel.setText("Lottery Number: " + randomNumber);
                }
                else {
                    JOptionPane.showMessageDialog(E24lottomachine.this,"Please enter valid numbers between 1 and 99 in all fields.",
                            "Invalid Input",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        resultLabel = new JLabel("Enter numbers and press button", SwingConstants.CENTER);
        n1 = new JTextField();
        n2 = new JTextField();
        n3 = new JTextField();
        n4 = new JTextField();
        n5 = new JTextField();
        panel.add(new JLabel("Lotto Machine", SwingConstants.CENTER));
        panel.add(generateButton);
        panel.add(resultLabel);
        panel.add(new JLabel("Number 1: ", SwingConstants.RIGHT));
        panel.add(n1);
        panel.add(new JLabel("Number 2: ", SwingConstants.RIGHT));
        panel.add(n2);
        panel.add(new JLabel("Number 3: ", SwingConstants.RIGHT));
        panel.add(n3);
        panel.add(new JLabel("Number 4: ", SwingConstants.RIGHT));
        panel.add(n4);
        panel.add(new JLabel("Number 5: ", SwingConstants.RIGHT));
        panel.add(n5);
        add(panel);
        setLocationRelativeTo(null);
    }
    private boolean isValidInput(int number) {
        return number >= 1 && number <= 99;
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                E24lottomachine frame = new E24lottomachine();
                frame.setVisible(true);
            }
        });
    }
}