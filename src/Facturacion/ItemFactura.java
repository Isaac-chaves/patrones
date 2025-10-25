/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facturacion;

import Catalogo.Producto;

/**
 *
 * @author jprod
 */
public class ItemFactura {
    private Producto producto;
    private int cantidad;
    private double precioUnitario;

    public Producto getProducto(){ return producto; }
    public int getCantidad(){ return cantidad; }
    public double getPrecioUnitario(){ return precioUnitario; }
    
    public double getSubtotal(){ 
        return cantidad * precioUnitario; 
    }
    
    public ItemFactura(Producto producto, int cantidad) {
        this.producto=producto; 
        this.cantidad=cantidad; 
        this.precioUnitario=producto.getPrecio();
    }

    @Override
    public String toString() {
        return "ItemFactura{" + "producto=" + producto + ", cantidad=" + cantidad + ", precioUnitario=" + precioUnitario + '}';
    }    

}
