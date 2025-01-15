import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GestionFinanzas {
    //atributos
    private Usuario usuario;

    private enum TipoGasto{Vacaciones, Alquiler, IRPF, Vicios}

    public GestionFinanzas(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    // Función para registrar un ingreso
    public boolean registrarIngreso(Usuario usuario, double monto) {
        String url = "jdbc:sqlite:Satander.db";
        String sql = "UPDATE Usuarios SET ahorros = ahorros + ? WHERE DNI = ?";

        try (Connection conn = DriverManager.getConnection(url);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setDouble(1, monto);
            pstmt.setString(2, usuario.getDNI());

            int filasActualizadas = pstmt.executeUpdate();
            if (filasActualizadas > 0) {
                usuario.setAhorros(usuario.getAhorros() + monto);
                return true;
            }

        } catch (SQLException e) {
            System.out.println("Error al registrar el ingreso: " + e.getMessage());
        }

        return false;
    }



}
