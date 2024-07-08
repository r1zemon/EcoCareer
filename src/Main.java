import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

import Service.config;

public class Main extends Application {

    
    @Override
    public void start(Stage primaryStage) throws SQLException {
        config.getConnection();
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("/Resource/fxml/LoginPertama.fxml"));
            AnchorPane root = loader.load();

            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Login Page");
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}

// import java.sql.SQLException;
// import java.util.Scanner;
// import Models.RegisterModel;
// import Models.LoginModel;
// import Service.config;

// public class Main {
//     public static void main(String[] args) throws SQLException {
//         config.getConnection();
//         Scanner scanner = new Scanner(System.in);

//         // Registration process
//         System.out.print("Enter ID: ");
//         int id = scanner.nextInt();
//         scanner.nextLine(); // Consume newline left-over

//         System.out.print("Enter Nama Lengkap: ");
//         String namaPeserta = scanner.nextLine();

//         System.out.print("Enter Username: ");
//         String emailPeserta = scanner.nextLine();

//         System.out.print("Enter Password: ");
//         String kataSandiPeserta = scanner.nextLine();

//         boolean isRegistered = RegisterModel.insertData(id, namaPeserta, emailPeserta, kataSandiPeserta);
        
//         if (isRegistered) {
//             System.out.println("Data successfully inserted.");
//         } else {
//             System.out.println("Failed to insert data.");
//             return; // Exit if registration fails
//         }

//         // Login process
//         System.out.println("Please login to continue:");
//         System.out.print("Enter Username: ");
//         String loginUsername = scanner.nextLine();

//         System.out.print("Enter Password: ");
//         String loginPassword = scanner.nextLine();

//         boolean isAuthenticated = LoginModel.login(loginUsername, loginPassword);

//         if (isAuthenticated) {
//             System.out.println("Login successful.");
//             // You can add more functionality here after successful login
//         } else {
//             System.out.println("Login failed. Invalid username or password.");
//         }
//     }
// }
