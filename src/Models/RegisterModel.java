package Models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Service.config;

public class RegisterModel {
    // public static String namaLengkap;

    public static boolean insertData(int id, String nama, String username, String password) {
        String query = "INSERT INTO tblbuatakunpeserta (id, namaPeserta, emailPeserta, kataSandiPeserta) VALUES (?, ?, ?, ?)";
        try (Connection conn = config.getConnection()) {
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, id);
            pstmt.setString(2, nama);
            pstmt.setString(3, username);
            pstmt.setString(4, password);
            int rowsAffected = pstmt.executeUpdate();
            System.out.println(rowsAffected + " row(s) inserted.");
            return true; 
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}

