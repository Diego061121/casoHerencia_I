package vista;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.Font;

public class PanelSalida extends JPanel
{
    public static JTextArea taResultados;
    public static JScrollPane spResultados;

    public PanelSalida() 
    {
        taResultados = new JTextArea();
        taResultados.setFont(new Font("Consolas", Font.PLAIN, 16));
        taResultados.setForeground(Color.BLACK);
        taResultados.setBorder(BorderFactory.createLoweredBevelBorder());
        taResultados.setEditable(false);
        taResultados.setBounds(9, 15, 512, 130);

        spResultados = new JScrollPane(taResultados);
        spResultados.setBounds(9, 15, 512, 130);
        
        TitledBorder borde = BorderFactory.createTitledBorder("Resultados");
        borde.setTitleColor(Color.BLACK);

        this.setLayout(null);
        this.setBackground(Color.decode("#f4da83"));
        this.setVisible(true);
        this.add(spResultados);
        this.setBorder(borde);
    }

    public static void mostrarResultados(String texto) 
    {
        taResultados.append(texto);
    }

    public void borrarTa() 
    {
        taResultados.setText("");
    }
}
