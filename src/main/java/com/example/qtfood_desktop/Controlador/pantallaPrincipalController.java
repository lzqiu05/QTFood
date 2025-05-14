package com.example.qtfood_desktop.Controlador;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;

public class pantallaPrincipalController {
    @FXML
    private HBox contenedorBusqueda;
    @FXML
    private BorderPane rootPane;

    @FXML
    private void gestionarPedido() throws IOException {
        loadFXML(getClass().getResource("/com/example/qtfood_desktop/Vistas/PedidoSearch.fxml"));

    }
    @FXML
    private void initialize() {
    }
    private void loadFXML(URL url) throws IOException {

        FXMLLoader loader = new FXMLLoader(url);
        rootPane.setCenter(loader.load());

    }
    private void BarraBusquedaPedido() throws IOException {
        VBox busquedaPedidos = FXMLLoader.load(getClass().getResource("/com/example/qtfood_desktop/Vistas/PedidoSearch.fxml"));

        contenedorBusqueda.getChildren().clear();
        contenedorBusqueda.getChildren().add(busquedaPedidos);
    }

    public void setBottom(Node nodo) {
        rootPane.setBottom(nodo);
    }

}
