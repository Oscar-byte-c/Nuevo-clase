package grafica2B.clases;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame {
    private JPanel panel1;
    private JButton btnSumar;
    private JButton btnRestar;
    private JButton btnMultiplicar;
    private JButton btnDividir;
    private JTextField text1;
    private JTextField text2;
    private JTextField textResultado;


    public Calculadora() {
        setTitle("");
        setSize(400, 300);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel1);
        setLocationRelativeTo(null);
        btnSumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double n1 = Double.parseDouble(text1.getText());
                double n2 = Double.parseDouble(text2.getText());
                double res = n1 + n2;
                textResultado.setText(String.valueOf(res));

            }
        });
        btnRestar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double n1 = Double.parseDouble(text1.getText());
                double n2 = Double.parseDouble(text2.getText());
                double res = n1 - n2;
                textResultado.setText(String.valueOf(res));
            }
        });
        btnDividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double n1 = Double.parseDouble(text1.getText());
                double n2 = Double.parseDouble(text2.getText());
                double res = n1 / n2;
                textResultado.setText(String.valueOf(res));
            }
        });
        btnMultiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double n1 = Double.parseDouble(text1.getText());
                double n2 = Double.parseDouble(text2.getText());
                double res = n1 * n2;
                textResultado.setText(String.valueOf(res));
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() ->
            new Calculadora().setVisible(true));
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
