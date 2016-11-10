/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplomercadona;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class EjemploMercadona {
    static ArrayList<Empleado> empleados = new ArrayList<Empleado>();
    static ArrayList<Producto> productos = new ArrayList<Producto>();
    
    public static void inicializarEstructura() {
        
        Producto p;
        Bebida b;
        BebidaAlcohol ba;
        ProductoCaduca pc;
        Empleado e;
        for (int i = 0; i < 10; i++) {
            e = new Empleado ();
            e.setNombre("JUAN");
            e.setEdad(i+80);
            
            p = new Producto();
            p.setCodigo("COD"+i);
            p.setPeso(i);
            productos.add(p);
            
            pc = new ProductoCaduca();
            pc.setCodigo("COD"+i);
            pc.setFecha("miercoles");
            pc.setPeso(i);
            productos.add(pc);
            
            b = new Bebida();
            b.setCodigo("COD"+i);
            b.setFecha("miercoles");
            b.setAzucar(i+6);
            b.setPeso(i);
            productos.add(b);
            
            ba = new BebidaAlcohol();
            ba.setCodigo("COD"+i);
            ba.setFecha("miercoles");
            ba.setAzucar(i+6);
            ba.setGraduacion(i+3);
            ba.setPeso(i);
            productos.add(ba);
        }
    }
    
    public static void mostrarTodosLosProductos () {
        for (Producto producto : productos) {
            producto.mostrar();
            
            System.out.println();
        }
    }
    
    public static void mostrarAzucarDeTodasLasBebidas () {
        for (Producto producto : productos) {
            if (producto instanceof Bebida) {
                System.out.println(  ((Bebida) producto).getAzucar()   );
                System.out.println(  ((Bebida) producto).getCodigo());
                System.out.println(  ((Bebida) producto).getFecha());
            
            }
        }
    }
    
    public static void mostrarAzucarBebidasNoAlcoholicas() {
        for (int i = 0; i < productos.size(); i++) {
            if ((productos.get(i) instanceof Bebida) 
                    && (!(productos.get(i) instanceof BebidaAlcohol))) {
                System.out.println(  ((Bebida) productos.get(i)).getAzucar()  );       
            }
        }
    }
    
    
    public static void mostrarMediaGraduacionBebidasAlcoholicas () {
        double suma = 0;
        int elementos = 0;
        
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i) instanceof BebidaAlcohol) {
                suma = suma + ((BebidaAlcohol)productos.get(i)).getGraduacion();
                elementos++;
            }   
        }
        System.out.println(suma / elementos);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        inicializarEstructura();
        //mostrarTodosLosProductos();
        mostrarMediaGraduacionBebidasAlcoholicas();
    }
    
}
