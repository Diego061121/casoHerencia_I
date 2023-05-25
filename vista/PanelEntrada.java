package vista;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import java.awt.Font;

public class PanelEntrada extends JPanel
{
    private JLabel lbTitulo;
    private JLabel lbNombreLibro;
    private JLabel lbNombreAutores;
    private JLabel lbAñoEdicion;
    private JLabel lbEdicionLujo;
    public static JTextField tfNombreLibro;
    private static JTextField tfNombreAutores;
    private static JTextField tfAñoEdicion;
    private static ButtonGroup bgEsLibroDeLujo;
    private static JRadioButton rbEsLibroDeLujo;
    private static JRadioButton rbNoEsLibroDeLujo;

    public PanelEntrada() 
    {
        lbTitulo = new JLabel("BIBLIOTECA SEÑOR PÉREZ", SwingConstants.CENTER);
        lbTitulo.setFont(new Font("Verdana", Font.BOLD, 20));
        lbTitulo.setForeground(Color.BLACK);
        lbTitulo.setBounds(0, 10, 558, 30);

        lbNombreLibro = new JLabel("Nombre =");
        lbNombreLibro.setFont(new Font("Serif", Font.PLAIN, 18));
        lbNombreLibro.setForeground(Color.BLACK);
        lbNombreLibro.setBounds(230, 55, 480, 30);

        tfNombreLibro = new JTextField();
        tfNombreLibro.setFont(new Font("Arial", Font.PLAIN, 18));
        tfNombreLibro.setForeground(Color.BLACK);
        tfNombreLibro.setBounds(330, 55, 190, 30);

        lbNombreAutores = new JLabel("Autores =");
        lbNombreAutores.setFont(new Font("Serif", Font.PLAIN, 18));
        lbNombreAutores.setForeground(Color.BLACK);
        lbNombreAutores.setBounds(230, 95, 480, 30);

        tfNombreAutores = new JTextField();
        tfNombreAutores.setFont(new Font("Arial", Font.PLAIN, 18));
        tfNombreAutores.setForeground(Color.BLACK);
        tfNombreAutores.setBounds(330, 95, 190, 30);

        lbAñoEdicion = new JLabel("Año =");
        lbAñoEdicion.setFont(new Font("Serif", Font.PLAIN, 18));
        lbAñoEdicion.setForeground(Color.BLACK);
        lbAñoEdicion.setBounds(230, 135, 480, 30);

        tfAñoEdicion = new JTextField();
        tfAñoEdicion.setFont(new Font("Arial", Font.PLAIN, 18));
        tfAñoEdicion.setForeground(Color.BLACK);
        tfAñoEdicion.setBounds(330, 135, 190, 30);

        lbEdicionLujo = new JLabel("Edición de lujo =");
        lbEdicionLujo.setFont(new Font("Serif", Font.PLAIN, 18));
        lbEdicionLujo.setForeground(Color.BLACK);
        lbEdicionLujo.setBounds(230, 175, 480, 30);

        bgEsLibroDeLujo = new ButtonGroup();

        rbEsLibroDeLujo = new JRadioButton("Sí");
        rbEsLibroDeLujo.setFont(new Font("Serif", Font.PLAIN, 18));
        rbEsLibroDeLujo.setBackground(Color.decode("#f4da83"));
        rbEsLibroDeLujo.setBounds(390, 175, 50, 30);
        bgEsLibroDeLujo.add(rbEsLibroDeLujo);

        rbNoEsLibroDeLujo = new JRadioButton("No");
        rbNoEsLibroDeLujo.setFont(new Font("Serif", Font.PLAIN, 18));
        rbNoEsLibroDeLujo.setBackground(Color.decode("#f4da83"));
        rbNoEsLibroDeLujo.setBounds(450, 175, 50, 30);
        bgEsLibroDeLujo.add(rbNoEsLibroDeLujo);

        TitledBorder borde = BorderFactory.createTitledBorder("Datos del libro");
        borde.setTitleColor(Color.BLACK);
        
        this.setLayout(null);
        this.setBackground(Color.decode("#f4da83"));
        this.setVisible(true);
        this.add(lbTitulo);
        this.add(lbNombreLibro);
        this.add(tfNombreLibro);
        this.add(lbNombreAutores);
        this.add(tfNombreAutores);
        this.add(lbAñoEdicion);
        this.add(tfAñoEdicion);
        this.add(lbEdicionLujo);
        this.add(rbEsLibroDeLujo);
        this.add(rbNoEsLibroDeLujo);
        this.setBorder(borde);
    }

    public static String getTfNombreLibro() 
    {
        return tfNombreLibro.getText();
    }
    public static String getTfNombreAutores() 
    {
        return tfNombreAutores.getText();
    }
    public static String getTfAñoEdicion() 
    {
        return tfAñoEdicion.getText();
    }

    public static boolean getRbLibroDeLujo()
    {
        if (rbEsLibroDeLujo.isSelected()) 
        {
            return true;
        } 
        else 
        {
            return false;
        }
    }

    public static void borrarTf() 
    {
        JOptionPane.showMessageDialog(null, "Los datos serán borrados...", "Biblioteca señor Pérez", JOptionPane.WARNING_MESSAGE);
        tfNombreLibro.setText("");
        tfNombreAutores.setText("");
        tfAñoEdicion.setText("");
        bgEsLibroDeLujo.clearSelection();
        PanelSalida.taResultados.setText("");
    }
}
