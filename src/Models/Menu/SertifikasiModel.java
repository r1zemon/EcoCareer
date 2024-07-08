package Models.Menu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Service.config;

public class SertifikasiModel {
    private String imagePath;

    public SertifikasiModel() {
        this.imagePath = "/Resource/Images/sertifikat.jpg";
    }

    public SertifikasiModel(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
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
