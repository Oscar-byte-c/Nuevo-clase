package Grafica;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class Table extends JFrame{
    private JPanel Panel3;
    private JTable tablaMaterias;


    public Table() {
        setTitle("Table");
        setSize(700, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(Panel3);
        setLocationRelativeTo(null);
        Panel3 = new JPanel();
        Panel3.add(new JLabel());
        cargarTablaMaterias();

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

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Table tabl = new Table();
            tabl.setVisible(true);
        });
    }
}
