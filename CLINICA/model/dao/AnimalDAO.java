package CLINICA.model.dao;

import CLINICA.model.Animal;
import CLINICA.model.odata.Database;

import java.sql.*;

public class AnimalDAO {

    public void inserir(Animal a) {
        String sql = "INSERT INTO animal (nome, especie, tutor_id) VALUES (?, ?, ?)";

        try (Connection conn = Database.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, a.getNome());
            stmt.setString(2, a.getEspecie());
            stmt.setInt(3, a.getTutorId());

            stmt.executeUpdate();

        } catch (Exception e) {
            System.out.println("Erro ao inserir Animal:");
            e.printStackTrace();
        }
    }

    public void listar() {
        String sql = "SELECT * FROM animal";

        try (Connection conn = Database.conectar();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " - " +
                    rs.getString("nome") + " | " +
                    rs.getString("especie") + " | Tutor: " +
                    rs.getInt("tutor_id")
                );
            }

        } catch (Exception e) {
            System.out.println("Erro ao listar Animais:");
            e.printStackTrace();
        }
    }
}