package system;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnection {

    public static Connection connection;

    public static void createConnection() {

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/SWASS", "root", "RubySapp16");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}