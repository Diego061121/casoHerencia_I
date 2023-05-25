package vista;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame
{
    public PanelEntrada miPanelEntrada;
    public PanelProceso miPanelProceso;
    public PanelSalida miPanelSalida;
    public DialogoLibroColeccion miDialogoLibroColeccion;

    public VentanaPrincipal() 
    {
        this.setLayout(null);

        miPanelEntrada = new PanelEntrada();
        miPanelEntrada.setBounds(10, 10, 465, 220);
        this.add(miPanelEntrada);

        miPanelProceso = new PanelProceso();
        miPanelProceso.setBounds(10, 240, 465, 80);
        this.add(miPanelProceso);

        miPanelSalida = new PanelSalida();
        miPanelSalida.setBounds(10, 330, 465, 220);
        this.add(miPanelSalida);

        this.setTitle("Biblioteca señor Pérez");
        this.setSize(500, 600);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLayout(null);
    }

    public void crearDialogoLibroColeccion() 
    {
        miDialogoLibroColeccion = new DialogoLibroColeccion();
    }
}
