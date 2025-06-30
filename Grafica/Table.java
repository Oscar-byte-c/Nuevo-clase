package Grafica;

import ficheros.clases.Escritura;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Table extends JFrame {
    private JPanel Panel3;
    private JTable tablaMaterias;
    private JButton btnGuardar;


    public Table() {
        setTitle("Table");
        setSize(700, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(Panel3);
        setLocationRelativeTo(null);
        Panel3 = new JPanel();
        cargarTablaMaterias();
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

    public String extraerDatos(JTable Table) {
        StringBuilder sb = new StringBuilder();

        for (int col = 0; col < tablaMaterias.getColumnCount(); col++) {
            sb.append(tablaMaterias.getColumnName(col));
            if (col < tablaMaterias.getColumnCount() - 1) sb.append(",");
        }
        sb.append("\n");
        for (int row = 0; row < tablaMaterias.getRowCount(); row++) {
            for (int col = 0; col < tablaMaterias.getColumnCount(); col++) {
                Object value = tablaMaterias.getValueAt(row, col);
                sb.append(value != null ? value.toString() : "");
                if (col < tablaMaterias.getColumnCount() - 1) sb.append(",");
            }
            sb.append("\n");
        }
        return sb.toString();
    }


    private  void cargarTablaMaterias() {
        String[] columnas = {"","Lunes", "Martes", "Miercoles","Jueves","Viernes"};

        Object[][] datos = {
                {"7h00","Bases de Datos", "Gestion Proyectos", "Gestion Proyectos","POO",""},
                {"8h00", "Bases de Datos",  "Gestion Proyectos", "Gestion Proyectos","POO",""},
                {"9h00", "Bases de Datos",  "Gestion Proyectos", "","POO",""},
                {"10h00", "",  "Analisis de Datos", "Gestion Proyectos","POO","Diseño de Interfaces"},
                {"11h00", "POO",  "Analisis de Datos", "Bases de Datos","","Diseño de Interfaces"},
                {"12h00", "POO",  "Analisis de Datos", "Bases de Datos","","Diseño de Interfaces"},
                {"13h00", "POO",  "Analisis de Datos", "Bases de Datos","","Diseño de Interfaces"},
                {"14h00", "Ingles",  "Ingles", "Ingles","Ingles","Ingles"},
                {"15h00", "Ingles",  "Ingles", "Ingles","Ingles","Ingles"}
        };
        DefaultTableModel modelo = new DefaultTableModel(datos, columnas);
        tablaMaterias.setModel(modelo);
    }
    public void escribirFichero(String info, String ruta) {
        try (FileWriter fichero = new FileWriter(ruta)) {
            PrintWriter pw = new PrintWriter(fichero);

            pw.println(info);
            System.out.println("Archivo creado exitosamnente");
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Table tabl = new Table();
            tabl.setVisible(true);
        });
    }


}
