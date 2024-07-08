package Models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Service.config;

public class LoginModelKonselor {
    public static boolean login(String username, String password) {
        String query = "SELECT * FROM tblbuatakunkonselor WHERE emailKonselor = ? AND kataSandiKonselor = ?";
        try {
            PreparedStatement pstmt = config.getConnection().prepareStatement(query);
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            ResultSet rs = pstmt.executeQuery();
            return rs.next(); 
        } catch (SQLException e) {
            System.err.println("Error in boolean login");
            e.printStackTrace();
            return false;
        }
    }
}

