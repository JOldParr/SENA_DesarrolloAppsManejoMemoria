/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senaactividad3;

/**
 *
 * @author Julian
 */
public class Producto {
    
    
    private String nombre;
    private int identificacion;
    private int numeroSerie;
    private double precio;
    private String Proveedor;

    public Producto() {
    }

    public Producto(String nombre, int identificacion, int numeroSerie, double precio, String Proveedor) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.numeroSerie = numeroSerie;
        this.precio = precio;
        this.Proveedor = Proveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getProveedor() {
        return Proveedor;
    }

    public void setProveedor(String Proveedor) {
        this.Proveedor = Proveedor;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", identificacion=" + identificacion + ", numeroSerie=" + numeroSerie + ", precio=" + precio + ", Proveedor=" + Proveedor + '}';
    }
    
    
}
