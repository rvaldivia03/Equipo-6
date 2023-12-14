/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;


import interfaces.ICadena;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import utils.ComparadorPorVentas;

/**
 *
 * @author Ramses
 */
public class Cadena implements ICadena{
    
      private List <Producto> productos;
      
       public Cadena() {
      productos = new ArrayList<Producto>();
    }

    public Cadena(List<Producto> productos) {
        this.productos = new ArrayList<Producto>();
    }


    
    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
 
    @Override
    public void agregarProducto(Producto p) {//Principio de la unica responsabilidad
        productos.add(p);
    }
    
    
    @Override
    public void eliminarProducto(Producto p) {
        productos.remove(p);
    }
    
    
    @Override
    public void modificarProducto(String codigo, Producto productoModificado) {
        for (int i= 0;i< productos.size();i++)
            if (productos.get(i).codigo.equals(codigo)){
                productos.set(i, productoModificado);
            }
        
    }
    
    @Override
    public List<ProductoNacional> obtenerProductosNacionales() {
                List<ProductoNacional> productosNacionales = new ArrayList<>();
        for (Producto producto : productos) {
            if (producto instanceof ProductoNacional) 
                productosNacionales.add((ProductoNacional) producto);
            }            
        return productosNacionales;            
    }
   
    
    @Override
    public List<ProductoImportado> obtenerProductosImportados() {
                List<ProductoImportado> productosImportados = new ArrayList<>();
        for (Producto producto : productos) {
            if (producto instanceof ProductoImportado) {
                productosImportados.add((ProductoImportado) producto);
            }
        }
        return productosImportados;

    }

    
    @Override
    public List<Producto> obtenerProductosPorDebajoExistencia(int valor,String nombre) {
        
                List<Producto> productosBajoExistencia = new ArrayList<>();
        for (Producto producto : productos) {
            if (producto.getExistencia() < valor && producto.nombre.equals(nombre)) {
                productosBajoExistencia.add(producto);
            }
        }
        return productosBajoExistencia;
    }

    @Override
    public List<ProductoImportado> obtenerProductosVendidosACubaPorPais(String pais) {
        
        List<ProductoImportado> vendidosACubaPorPais = new ArrayList<>();
            for(ProductoImportado p : obtenerProductosImportados())
                if(p.getPaisProcedencia().equals(pais))
                    vendidosACubaPorPais.add(p);
            return vendidosACubaPorPais;
    }

    @Override
    public List<ProductoNacional> productosPorEcimadeValor(int precioDado) {
        List<ProductoNacional> productosPorEcimadeValor = new ArrayList<>();
        for(ProductoNacional p : obtenerProductosNacionales())
            if(p.calcularPrecioVenta() > precioDado ){
                productosPorEcimadeValor.add(p);
            }
        
        return productosPorEcimadeValor;
    }
    
    public int CantidadPorEncimaDePrecio(int precioDado){
       List<ProductoNacional> aux = productosPorEcimadeValor(precioDado);
       return aux.size();
    }
    @Override
    public List<Producto> listaOrdenadaPorVentas() {//Principio de la unica responsabilidad
        List<Producto> ordenarListaPorVentas = productos;//para evitar que la funcion ordene la lista y devuelva el producto
        ComparadorPorVentas comparador = new ComparadorPorVentas();
        Collections.sort(ordenarListaPorVentas, comparador);
        return ordenarListaPorVentas;    
   
    }

    @Override
    public Producto productoMasVendido() {//Para ello se crearon estos 2 metodos para que devuelvan el producto mas y menos vendido
       return listaOrdenadaPorVentas().get(0);
    }

    @Override
    public Producto productoMenosVendido() {
       return listaOrdenadaPorVentas().get(listaOrdenadaPorVentas().size()-1);
    }

    
  
}