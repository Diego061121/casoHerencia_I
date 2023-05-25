package modelo;

public class LibroColeccion extends Libro
{
    private String nombreColecccion;
    private Integer numeroColeccion;
    public LibroColeccion(String nombre, String autores, Integer añoEdicion, Boolean edicionLujo, String nombreColecccion, Integer numeroColeccion) 
    {
        super(nombre, autores, añoEdicion, edicionLujo);
        this.nombreColecccion = nombreColecccion;
        this.numeroColeccion = numeroColeccion;
    }

        public String getNombreColecccion() 
        {
            return nombreColecccion;
        }
        public Integer getNumeroColeccion() 
        {
            return numeroColeccion;
        }

        public void setNombreColecccion(String nombreColecccion) 
        {
            this.nombreColecccion = nombreColecccion;
        }
        public void setNumeroColeccion(Integer numeroColeccion) 
        {
            this.numeroColeccion = numeroColeccion;
        }

        @Override
        public String toString() 
        {
            return "\nNombre: " + nombre + "\nAutores: " + autores + "\nAño: " + añoEdicion + "\nEdición de lujo: " + edicionLujo + "\nNombre de colección: " + nombreColecccion + "\nNúmero de colección: " + numeroColeccion + "\n";
        }
}
