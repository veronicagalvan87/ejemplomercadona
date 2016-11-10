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
public class Bebida extends ProductoCaduca {
    private double azucar;

    public void mostrar() {
        super.mostrar();
        System.out.println(this.azucar);
    }    
    
    public double getAzucar() {
        return azucar;
    }

    public void setAzucar(double azucar) {
        this.azucar = azucar;
    }
    
    
}
