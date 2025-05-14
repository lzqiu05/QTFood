package com.example.qtfood_desktop.Controlador;

import com.example.qtfood_desktop.Modelo.Pedido;
import com.example.qtfood_desktop.Vista.App;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.*;
import java.time.LocalDateTime;

public class PedidosController {
    private static ObservableList<Pedido> datos= FXCollections.observableArrayList();
    @FXML
    private TableView tableView;
    @FXML
    private TextField PrecioField;
    @FXML
    private DatePicker FechaField;

    private void rellenarTabla() {
       /*String sql= "SELECT * FROM PEDIDOS";

        try (Connection conexion= App.getConnection()){

            PreparedStatement sentencia=conexion.prepareStatement(sql);

            ResultSet resultSet=sentencia.executeQuery();

            datos.clear();
            while (resultSet.next()) {
                int idPedido = resultSet.getInt("id_pedido");
                int idUsuario = resultSet.getInt("id_usuario");
                Timestamp fecha = resultSet.getTimestamp("fecha");
                double total = resultSet.getDouble("total");
                String metodoPago = resultSet.getString("metodo_pago");
                String direccion = resultSet.getString("direccion");
                String estado = resultSet.getString("estado");

                Pedido pedido = new Pedido(
                        idPedido,
                        idUsuario,
                        fecha.toLocalDateTime(),
                        total,
                        metodoPago,
                        direccion,
                        estado
                );

                datos.add(pedido);
            }

            tableView.setItems(datos);


        } catch (SQLException e) {
            e.printStackTrace();

        }*/

    }

    @FXML
    private void initialize() {
        tableView.getColumns().clear();

        TableColumn<Pedido, Integer> colIDPedido = new TableColumn<>("ID Pedido");
        colIDPedido.setCellValueFactory(new PropertyValueFactory<>("idPedido"));

        TableColumn<Pedido, Integer> colIDUsuario = new TableColumn<>("ID Usuario");
        colIDUsuario.setCellValueFactory(new PropertyValueFactory<>("idUsuario"));

        TableColumn<Pedido, LocalDateTime> colFecha = new TableColumn<>("Fecha");
        colFecha.setCellValueFactory(new PropertyValueFactory<>("fecha"));

        TableColumn<Pedido, Double> colTotal = new TableColumn<>("Total");
        colTotal.setCellValueFactory(new PropertyValueFactory<>("total"));

        TableColumn<Pedido, String> colMetodoPago = new TableColumn<>("Método de Pago");
        colMetodoPago.setCellValueFactory(new PropertyValueFactory<>("metodoPago"));

        TableColumn<Pedido, String> colDireccion = new TableColumn<>("Dirección");
        colDireccion.setCellValueFactory(new PropertyValueFactory<>("direccion"));

        TableColumn<Pedido, String> colEstado = new TableColumn<>("Estado");
        colEstado.setCellValueFactory(new PropertyValueFactory<>("estado"));

        tableView.getColumns().addAll(
                colIDPedido,
                colIDUsuario,
                colFecha,
                colTotal,
                colMetodoPago,
                colDireccion,
                colEstado
        );

        rellenarTabla();
    }

}
