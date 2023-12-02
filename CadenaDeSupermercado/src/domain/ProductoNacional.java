/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

/**
 *
 * @author Ramses
 */
public class ProductoNacional extends Producto{//Princiio de Abierto/Cerrado.. se crea la clase que exteinde los 
                                               //la clase producto en lugar de sustituirla

    private String empresaProductora;

    public ProductoNacional(String empresaProductora, String codigo, String nombre, double precioCosto, double existencia,int cantidadDeVentas) {
        super(codigo, nombre, precioCosto, existencia,cantidadDeVentas);
        this.empresaProductora = empresaProductora;
    }

    public String getEmpresaProductora() {
        return empresaProductora;
    }

    public void setEmpresaProductora(String empresaProductora) {
        this.empresaProductora = empresaProductora;
    }

    
      @Override
    public double calcularPrecioVenta() {
        return precioCosto + (0.05 * precioCosto);
    }
}
 
    

