package Models.Menu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Service.config;

public class Sertifikat {
        public void save(SertifikasiModel sertifikasiModel) throws SQLException {
        Connection connection = null;
        try {
            connection = config.getConnection();
            String query = "INSERT INTO sertifikasi (image_path) VALUES (?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, sertifikasiModel.getImagePath());
            preparedStatement.executeUpdate();
        } finally {
            if (connection != null) {
                connection.close();
            }
        }
    }

    public SertifikasiModel load(int id) throws SQLException {
        Connection connection = null;
        try {
            connection = config.getConnection();
            String query = "SELECT image_path FROM sertifikasi WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                String imagePath = resultSet.getString("image_path");
                return new SertifikasiModel(imagePath);
            } else {
                throw new SQLException("No certification found with the provided ID.");
            }
        } finally {
            if (connection != null) {
                connection.close();
            }
        }
    }
}
