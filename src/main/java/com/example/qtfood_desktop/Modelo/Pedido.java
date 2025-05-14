package com.example.qtfood_desktop.Modelo;

import java.time.LocalDateTime;

import java.time.LocalDateTime;

public class Pedido {
    private int idPedido;
    private int idUsuario;
    private LocalDateTime fecha;
    private double total;
    private String metodoPago;
    private String direccion;
    private String estado;

    public Pedido() {
        // Constructor vacío
    }

    public Pedido(int idPedido, int idUsuario, LocalDateTime fecha, double total, String metodoPago, String direccion, String estado) {
        this.idPedido = idPedido;
        this.idUsuario = idUsuario;
        this.fecha = fecha;
        this.total = total;
        this.metodoPago = metodoPago;
        this.direccion = direccion;
        this.estado = estado;
    }

    // Getters y Setters

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "idPedido=" + idPedido +
                ", idUsuario=" + idUsuario +
                ", fecha=" + fecha +
                ", total=" + total +
                ", metodoPago='" + metodoPago + '\'' +
                ", direccion='" + direccion + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
