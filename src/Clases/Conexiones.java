package Clases;

import java.sql.*;

public class Conexiones {

    public static Connection conexion() {
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/libreriaerrante", "root", "");
            return cn;

        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }
}
