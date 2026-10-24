import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    private static final String URL =
            "jdbc:h2:./data/biblioteca";

    private static final String USUARIO = "sa";
    private static final String PASSWORD = "";

    public static Connection conectar() throws SQLException {
        return DriverManager.getConnection(
                URL, USUARIO, PASSWORD
        );
    }
}