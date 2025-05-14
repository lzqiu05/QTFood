package com.example.qtfood_desktop.Vista;

import com.example.qtfood_desktop.Modelo.Admin;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.sql.*;

public class App extends Application {
    private static Scene scene;
    private static final String URL = "jdbc:mysql://localhost:3306/qtfood2";
    private static final String USER = "root"; // Cambia esto por tu usuario
    private static final String PASSWORD = "";
    private static Admin usuarioActual;


    public static Admin getUsuarioActual() {
        return usuarioActual;
    }

    public static void setUsuarioActual(Admin usuarioActual) {

        App.usuarioActual = usuarioActual;
    }

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión exitosa a la base de datos.");
        } catch (SQLException e) {
            System.err.println("Error de conexión a la base de datos: " + e.getMessage());
        }
        return connection;
    }
    @Override
    public void start(Stage stage) throws IOException {
        // Cargar la escena inicial
        scene = new Scene(loadFXML("Login"), 600, 400);
        stage.setTitle("QTFood!");
        stage.setScene(scene);
        stage.show();
    }

    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    public static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("/com/example/qtfood_desktop/" + fxml + ".fxml"));
        return fxmlLoader.load();
    }
    public static void main(String[] args) {
        Font.loadFont(App.class.getResourceAsStream("/com/example/qtfood_desktop/font/fantasia.ttf"), 14);

        launch(); // Iniciar la aplicación JavaFX
    }

}
