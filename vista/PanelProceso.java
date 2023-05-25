package vista;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import java.awt.Font;

public class PanelProceso extends JPanel
{
    public JButton btnCrearLibro;
    public JButton btnCrearColeccion;
    public JButton btnImprimir;
    public JButton btnBorrar;
    public JButton btnSalir;

    public PanelProceso() 
    {
        btnCrearLibro = new JButton("Crear libro");
        btnCrearLibro.setFont(new Font("Arial", Font.PLAIN, 12));
        btnCrearLibro.setForeground(Color.BLACK);
        btnCrearLibro.setBackground(Color.WHITE);
        btnCrearLibro.setBorder(BorderFactory.createRaisedBevelBorder());
        btnCrearLibro.setBounds(10, 25, 85, 30);
        btnCrearLibro.setActionCommand("crearLibro");

        btnCrearColeccion = new JButton("Crear " + "\ncolección");
        btnCrearColeccion.setFont(new Font("Arial", Font.PLAIN, 12));
        btnCrearColeccion.setForeground(Color.BLACK);
        btnCrearColeccion.setBackground(Color.WHITE);
        btnCrearColeccion.setBorder(BorderFactory.createRaisedBevelBorder());
        btnCrearColeccion.setBounds(100, 25, 85, 30);
        btnCrearColeccion.setActionCommand("crearColeccion");

        btnImprimir = new JButton("Imprimir");
        btnImprimir.setFont(new Font("Arial", Font.PLAIN, 12));
        btnImprimir.setForeground(Color.BLACK);
        btnImprimir.setBackground(Color.WHITE);
        btnImprimir.setBorder(BorderFactory.createRaisedBevelBorder());
        btnImprimir.setBounds(190, 25, 85, 30);
        btnImprimir.setActionCommand("imprimirLibros");

        btnBorrar = new JButton("Borrar");
        btnBorrar.setFont(new Font("Arial", Font.PLAIN, 12));
        btnBorrar.setForeground(Color.BLACK);
        btnBorrar.setBackground(Color.WHITE);
        btnBorrar.setBorder(BorderFactory.createRaisedBevelBorder());
        btnBorrar.setBounds(280, 25, 85, 30);
        btnBorrar.setActionCommand("borrarTexto");

        btnSalir = new JButton("Salir");
        btnSalir.setFont(new Font("Arial", Font.PLAIN, 12));
        btnSalir.setForeground(Color.BLACK);
        btnSalir.setBackground(Color.WHITE);
        btnSalir.setBorder(BorderFactory.createRaisedBevelBorder());
        btnSalir.setBounds(370, 25, 85, 30);
        btnSalir.setActionCommand("cerrarVentana");

        TitledBorder borde = BorderFactory.createTitledBorder("Opciones");
        borde.setTitleColor(Color.BLACK);

        this.setLayout(null);
        this.setBackground(Color.decode("#f4da83"));
        this.setVisible(true);
        this.add(btnCrearLibro);
        this.add(btnCrearColeccion);
        this.add(btnImprimir);
        this.add(btnBorrar);
        this.add(btnSalir);
        this.setBorder(borde);
    }

}
