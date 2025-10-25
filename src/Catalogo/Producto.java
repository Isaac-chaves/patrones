/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Catalogo;

/**
 *
 * @author jprod
 */
public class Producto {
    private String codigo; // único visible al usuario
    private String nombre;
    private double precio;
    private int stock;
    private Categoria categoria;
    
    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public int getStock() { return stock; }
    public Categoria getCategoria() { return categoria; }
    
    public void setNombre(String n){ this.nombre=n; }
    public void setPrecio(double p){ this.precio=p; }
    public void setStock(int s){ this.stock=s; }
    public void setCategoria(Categoria c){ this.categoria=c; }

    public Producto(String codigo, String nombre, double precio, int stock, Categoria categoria) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", stock=" + stock + ", categoria=" + categoria + '}';
    }

}
