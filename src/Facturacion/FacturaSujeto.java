/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facturacion;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author UTN
 */
public class FacturaSujeto {
     private final List<FacturaObserver> observadores = new ArrayList<>();

public void agregarObservador(FacturaObserver o) {
      observadores.add(o);
    }
 
  public void eliminarObservador(FacturaObserver o) {
              observadores.remove(o);
    }

 public void notificar(Factura factura) {
    for (FacturaObserver o : observadores) {
          o.actualizar(factura);
        }
    }
    
    
}
