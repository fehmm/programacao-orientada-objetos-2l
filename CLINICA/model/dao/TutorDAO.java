package CLINICA.model.dao;

import CLINICA.model.Tutor;
import CLINICA.model.odata.Database;

import java.sql.*;

public class TutorDAO {

    public void inserir(Tutor t) {
        String sql = "INSERT INTO tutor (nome, telefone) VALUES (?, ?)";

        try (Connection conn = Database.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, t.getNome());
            stmt.setString(2, t.getTelefone());

            stmt.executeUpdate();

        } catch (Exception e) {
            System.out.println("Erro ao inserir Tutor:");
            e.printStackTrace();
        }
    }

    public void listar() {
        String sql = "SELECT * FROM tutor";

        try (Connection conn = Database.conectar();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " - " +
                    rs.getString("nome") + " | " +
                    rs.getString("telefone")
                );
            }

        } catch (Exception e) {
            System.out.println("Erro ao listar Tutores:");
            e.printStackTrace();
        }
    }
}
