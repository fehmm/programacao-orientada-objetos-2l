package model.odata;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {

    public static Connection conectar() {
        try {
           
            return DriverManager.getConnection("jdbc:sqlite:clinica.db");
        } catch (Exception e) {
            System.out.println("Erro ao conectar ao banco: " + e.getMessage());
            return null;
        }
    }
}