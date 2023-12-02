/*
2 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaces;

import domain.Producto;
import domain.ProductoImportado;
import domain.ProductoNacional;
import java.util.List;

/**
 *
 * @author Ramses
 */
public interface IAlmacen { //Principio de Segregacio de Interfaz.., se crearom pequeñas 
                               //interfaces para evitar que clases implementes metodos que no necesitan
    
    void agregarProducto (Producto p);
    void modificarProducto (String codigo, Producto productoModificado);
    void eliminarProducto (Producto p);
    Producto productoMasVendido();
    Producto productoMenosVendido();
    
    List <ProductoNacional> obtenerProductosNacionales();
    List <ProductoImportado> obtenerProductosImportados();
    List <Producto> obtenerProductosPorDebajoExistencia(int valor,Producto p);
    List <Producto> listaOrdenadaPorVentas();
    List <ProductoImportado> obtenerProductosVendidosACubaPorPais(String pais);
    List <ProductoNacional> productosPorEcimadeValor(int precioDado);
    
}
