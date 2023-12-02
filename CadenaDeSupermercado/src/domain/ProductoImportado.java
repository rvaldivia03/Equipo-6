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
public class ProductoImportado extends Producto{ //Princiio de Abierto/Cerrado.. se crea la clase que exteinde los 
                                               //la clase producto en lugar de sustituirla
    
    private String paisProcedencia;
    private double precioCompra;

    public ProductoImportado(String paisProcedencia, double precioCompra, String codigo, String nombre, double precioCosto, double existencia, int cantidaDeVentas) {
        super(codigo, nombre, precioCosto, existencia, cantidaDeVentas);
        this.paisProcedencia = paisProcedencia;
        this.precioCompra = precioCompra;
    }

    public String getPaisProcedencia() {
        return paisProcedencia;
    }

    public void setPaisProcedencia(String paisProcedencia) {
        this.paisProcedencia = paisProcedencia;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

        @Override
    public double calcularPrecioVenta() {
        return precioCosto + (0.05 * precioCosto) + (27 * precioCompra);
    }

    
}
