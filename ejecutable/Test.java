package ejecutable;

import controlador.Controlador;
import modelo.Biblioteca;
import vista.VentanaPrincipal;

public class Test 
{
    public static void main(String[] args) 
    {
        Biblioteca miBiblioteca = new Biblioteca();
        VentanaPrincipal miVentana = new VentanaPrincipal();
        new Controlador(miVentana, miBiblioteca);
    }
}
