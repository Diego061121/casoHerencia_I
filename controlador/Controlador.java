package controlador;

import modelo.Biblioteca;
import modelo.Libro;
import modelo.LibroColeccion;
import vista.VentanaPrincipal;
import vista.DialogoLibroColeccion;
import vista.PanelEntrada;
import vista.PanelSalida;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Controlador implements ActionListener
{
    private VentanaPrincipal miVentanaPrincipal;
    private Biblioteca biblioteca;

    public Controlador(VentanaPrincipal miVentanaPrincipal, Biblioteca biblioteca) 
    {
    this.miVentanaPrincipal = miVentanaPrincipal;
    this.biblioteca = biblioteca;
    this.miVentanaPrincipal.miPanelProceso.btnCrearLibro.addActionListener(this);
    this.miVentanaPrincipal.miPanelProceso.btnCrearColeccion.addActionListener(this);
    this.miVentanaPrincipal.miPanelProceso.btnImprimir.addActionListener(this);
    this.miVentanaPrincipal.miPanelProceso.btnBorrar.addActionListener(this);
    this.miVentanaPrincipal.miPanelProceso.btnSalir.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) 
    {
        String comando = ae.getActionCommand();

        if (comando.equals("crearLibro")) 
        {
            String nombreLibro = PanelEntrada.getTfNombreLibro();
            String nombreAutores = PanelEntrada.getTfNombreAutores();
            Integer anioEdicion = Integer.parseInt(PanelEntrada.getTfAñoEdicion());
            Boolean libroDeLujo = PanelEntrada.getRbLibroDeLujo();
            biblioteca.agregarLibro(new Libro(nombreLibro, nombreAutores, anioEdicion, libroDeLujo));
            PanelSalida.mostrarResultados("Se ha creado un nuevo libro!\n");
        } 
        else if (comando.equals("crearColeccion")) 
        {
            miVentanaPrincipal.crearDialogoLibroColeccion();
            miVentanaPrincipal.miDialogoLibroColeccion.agregarOyenteBoton(this);
        } 
        else if (comando.equals("crearLibroColeccion")) 
        {
        String nombreLibro = DialogoLibroColeccion.getTfNombreLibro();
        String nombreAutores = DialogoLibroColeccion.getTfNombreAutores();
        Integer anioEdicion = Integer.parseInt(DialogoLibroColeccion.getTfAñoEdicion());
        Boolean libroDeLujo = DialogoLibroColeccion.getRbLibroDeLujo();
        String nombreColeccion = DialogoLibroColeccion.getTfNombreColeccion();
        Integer numeroColeccion = Integer.parseInt(DialogoLibroColeccion.getTfNumeroColeccion());
        biblioteca.agregarLibro(new LibroColeccion(nombreLibro, nombreAutores, anioEdicion, libroDeLujo, nombreColeccion, numeroColeccion));
        PanelSalida.mostrarResultados("Se ha creado un nuevo libro de colección!\n");
        } 
        else if (comando.equals("imprimirLibros")) 
        {
            biblioteca.imprimirLibros();
        } 
        else if (comando.equals("borrarTexto")) 
        {
            vista.PanelEntrada.borrarTf();
            this.miVentanaPrincipal.miPanelSalida.borrarTa();
        } 
        else if (comando.equals("cerrarVentana")) {
            JOptionPane.showMessageDialog(null, "El programa se cerrará...", "Biblioteca señor Pérez",
            JOptionPane.WARNING_MESSAGE);
            System.exit(0);
        }
    }
}
