package modelo;

public class Libro 
{
    //Atributos
    protected String nombre, autores;
    protected int añoEdicion;
    protected boolean edicionLujo;

    //Metodos
    public Libro(String pNombre, String pAutores, Integer pAñoEdicion, Boolean pEdicionLujo) 
    {
        this.nombre = pNombre;
        this.autores = pAutores;
        this.añoEdicion = pAñoEdicion;
        this.edicionLujo = pEdicionLujo;
}

    public Libro()
    {
        this.nombre = "";
        this.autores = "";
        this.añoEdicion = 0;
        this.edicionLujo = false;
    }

    public String getNombre() 
    {
        return nombre;
    }
    public String getAutores() 
    {
        return autores;
    }
    public int getAñoEdicion() 
    {
        return añoEdicion;
    }
    public boolean isEdicionLujo() 
    {
        return edicionLujo;
    }

    public String toString() {
        return "\nNombre: " + nombre + "\nAutores: " + autores + "\nAño: " + añoEdicion + "\nEdición de lujo:" + edicionLujo + "\n";
}
}
