import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorUI extends JFrame implements ActionListener {

    private JTextField display;
    private double num1 = 0, num2 = 0;
    private char operator = ' ';
    private boolean isOperatorPressed = false;

    public CalculatorUI() {
        // Ρυθμίσεις παραθύρου
        setTitle("Digital Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null); // Κέντρο οθόνης

        // Οθόνη εμφάνισης
        display = new JTextField();
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.BOLD, 26));
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        add(display, BorderLayout.NORTH);

        // Κουμπιά
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4, 5, 5));

        String[] buttons = {
                "AC", "÷", "×", "-",
                "7", "8", "9", "+",
                "4", "5", "6", "=",
                "1", "2", "3", "",
                "0", ".", "", ""
        };

        for (String text : buttons) {
            if (text.equals("")) {
                panel.add(new JLabel());
                continue;
            }
            JButton btn = new JButton(text);
            btn.setFont(new Font("Arial", Font.BOLD, 18));
            btn.addActionListener(this);
            panel.add(btn);
        }

        add(panel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        if (cmd.charAt(0) >= '0' && cmd.charAt(0) <= '9' || cmd.equals(".")) {
            if (isOperatorPressed) {
                display.setText("");
                isOperatorPressed = false;
            }
            display.setText(display.getText() + cmd);
        }
        else if (cmd.equals("AC")) {
            display.setText("");
            num1 = num2 = 0;
            operator = ' ';
        }
        else if (cmd.equals("=")) {
            try {
                num2 = Double.parseDouble(display.getText());
                double result = 0;

                switch (operator) {
                    case '+':
                        result = Addition.add(num1, num2);
                        break;
                    case '-':
                        result = Subtraction.sub(num1, num2);
                        break;
                    case '×':
                        result = Multiplication.multiply(num1, num2);
                        break;
                    case '÷':
                        result = Division.divide(num1, num2);
                        break;
                }
                display.setText(String.valueOf(result));
            } catch (Exception ex) {
                display.setText("Σφάλμα");
            }
        }
        else { // είναι πράξη
            try {
                num1 = Double.parseDouble(display.getText());
                operator = cmd.charAt(0);
                isOperatorPressed = true;
            } catch (Exception ex) {
                display.setText("Σφάλμα");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CalculatorUI().setVisible(true));
    }
}
