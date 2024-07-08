package Models.Menu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Service.config;

public class UjianModel {

    public static String namaLengkap;

    public static boolean insertPilihan(String answer) {
        String query = "INSERT INTO tblujian (jawaban) VALUES (?)";
        try (Connection conn = config.getConnection()) {
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, answer);
            int rowsAffected = pstmt.executeUpdate();
            System.out.println(rowsAffected + " row(s) inserted.");
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static List<AnswerData> getAnswerData() {
        List<AnswerData> dataList = new ArrayList<>();
        String query = "SELECT jawaban, COUNT(*) as count FROM tblujian GROUP BY jawaban";
        try (Connection conn = config.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query);
             ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                String answer = rs.getString("jawaban");
                int count = rs.getInt("count");
                dataList.add(new AnswerData(answer, count));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dataList;
    }

    public static class AnswerData {
        private final String answer;
        private final int count;

        public AnswerData(String answer, int count) {
            this.answer = answer;
            this.count = count;
        }

        public String getAnswer() {
            return answer;
        }

        public int getCount() {
            return count;
        }
    }
}

