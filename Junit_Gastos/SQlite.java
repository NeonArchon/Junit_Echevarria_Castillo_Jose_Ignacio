import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SQlite {

   private String url = "jdbc:sqlite:Satander.db"; // Ruta a tu archivo SQLite

    public SQlite(){

        try(Connection conn = DriverManager.getConnection(url)){
            if (conn != null) {
                System.out.println("¡Conexión establecida!");
            }
        } catch(SQLException e)

        {
            System.out.println("No se pudo conectar: " + e.getMessage());

        }

    }

    //table de usuarios

    //String nombre, String DNI, double ahorros)
    private void TablaUsuarios (Connection conn){

        String sql = "CREATE TABLE IF NOT EXISTS Usuarios (" +
                "nombre VARCHAR(100) NOT NULL, " +
                "DNI VARCHAR(20) UNIQUE NOT NULL, " +
                "ahorros REAL NOT NULL DEFAULT 0.0" +
                ");";

        try (Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("La tabla Usuarios ha sido creada o ya existe.");
        } catch (SQLException e) {
            System.out.println("Error al crear la tabla Usuarios: " + e.getMessage());
        }

    }



}

