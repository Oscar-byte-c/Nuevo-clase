package Grafica.estado;


import javax.swing.*;

public class Estado extends JFrame {
    private JPanel panel1;
    private JComboBox comboBox1;
    private JButton enviarInformacionButton;

    public Estado() {
        setTitle("");
        setSize(400, 300);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel1);
        setLocationRelativeTo(null);
        panel1 = new JPanel();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Estado es = new Estado();
            es.setVisible(true);
        });
    }

}