/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplomercadona;

/**
 *
 * @author usuario
 */
public class ProductoCaduca extends Producto {
    private String fecha;
    
    public void mostrar() {
        super.mostrar();
        System.out.println(this.fecha);
        
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
}
