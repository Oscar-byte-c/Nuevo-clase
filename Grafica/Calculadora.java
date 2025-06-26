package Grafica;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame {

    private JPanel panel1;
    private JButton btnRestar;
    private JButton btnDividir;
    private JButton btnProducto;
    private JButton btnSumar;
    private JLabel Segundo;
    private JButton resultadoButton;
    private JTextField txtResultado;
    private JTextField txt1;
    private JTextField txt2;


        public Calculadora() {
            setTitle("Calculadora");

            setSize(300, 300);

            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            panel1 = new JPanel();
            panel1.add(new JLabel("Aquí irán los componentes"));

            setContentPane(panel1);

            setLocationRelativeTo(null);
            btnSumar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    double n1= Double.parseDouble(txt1.getText());
                    double n2= Double.parseDouble(txt2.getText());
                    double res= n1+n2;
                    txtResultado.setText(String.valueOf(res));
                }
            });
            btnRestar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    double n1= Double.parseDouble(txt1.getText());
                    double n2= Double.parseDouble(txt2.getText());
                    double res= n1-n2;
                    txtResultado.setText(String.valueOf(res));
                }
            });
            btnDividir.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    double n1= Double.parseDouble(txt1.getText());
                    double n2= Double.parseDouble(txt2.getText());
                    double res= n1/n2;
                    txtResultado.setText(String.valueOf(res));


                }
            });
            btnProducto.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    double n1= Double.parseDouble(txt1.getText());
                    double n2= Double.parseDouble(txt2.getText());
                    double res= n1*n2;
                    txtResultado.setText(String.valueOf(res));
                }
            });
        }


        public static void main(String[] args) {
            SwingUtilities.invokeLater(() -> {
                Calculadora calc = new Calculadora();
                calc.setVisible(true);
            });
        }
    }










