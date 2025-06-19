package grafica2B.clases;

import javax.swing.*;

public class Estado extends JFrame {
    private JPanel panel2;
    private JComboBox comboBox;
    private JButton enviarInformacionButton;

    public Estado() {
        setTitle("");
        setSize(400, 300);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel2);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() ->
                new Estado().setVisible(true));
    }

}