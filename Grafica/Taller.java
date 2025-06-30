package Grafica;


import ficheros.clases.Escritura;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Taller extends JFrame {
    private JPanel Panel4;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JComboBox comboBox1;
    private JRadioButton masculinoRadioButton;
    private JRadioButton femeninoRadioButton;
    private JRadioButton otroRadioButton;
    private JComboBox comboBox2;
    private JButton btnGuardar;
    private JButton limpiarButton;
    private JButton salirButton;
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;


    public Taller() {
        setTitle("Taller");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(Panel4);
        setLocationRelativeTo(null);
        Panel4 = new JPanel();
        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Escritura es = new Escritura();
                JOptionPane.showMessageDialog(null,"Archivo guardado correctamente","Horario",JOptionPane.INFORMATION_MESSAGE);
                es.escribirFichero(extraerDatos(tablaMaterias),"C:/Users/POO/Documents/POO/Horario.csv");
//                System.out.println(extraerDatos(tablaMaterias));
            }
        });

    }


        public static void main (String[]args){
            SwingUtilities.invokeLater(() -> {
                Taller tall = new Taller();
                tall.setVisible(true);
            });
        }


}