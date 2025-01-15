import java.sql.Connection;

public class Usuario {

    //atributos
    private String Nombre;
    private String DNI;
    private double Ahorros;

    //constructor
    public Usuario(String nombre, String DNI, double ahorros) {
        Nombre = nombre;
        this.DNI = DNI;
        Ahorros = ahorros;
    }



}
