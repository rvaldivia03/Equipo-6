/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

import interfaces.ICadena;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Ramses
 */
public class CadenaTest {
       Cadena cadena = new Cadena();
       public CadenaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void agregarProducto(){
        Producto p = new Producto("000", "gorra", 3, 6, 9) {
             
             @Override
             public double calcularPrecioVenta() {
          return 0;
             }
        };
         List<Producto> productos = cadena.getProductos();
         productos.add(p);
        Assert.assertTrue(productos.contains(p));
        Assert.assertEquals(1, productos.size());
        Assert.assertTrue(cadena.getProductos().contains(p));
     }
    
    @Test
    public void testObtenerProductosNacionales() {
        ProductoNacional productoNacional = new ProductoNacional("Textilera", "001", "camisa", 5, 10, 15);
        List<Producto> productos = cadena.getProductos();
        productos.add(productoNacional);
        List<ProductoNacional> productosNacionales = cadena.obtenerProductosNacionales();
        Assert.assertTrue(productosNacionales.contains(productoNacional));
        Assert.assertEquals(1, productosNacionales.size());
        Assert.assertTrue(cadena.obtenerProductosNacionales().contains(productoNacional));
    }
    @Test
    public void testObtenerProductosImportados() {
        ProductoImportado productoImportado = new ProductoImportado("Chile", 25, "002", "pantalon", 10, 15, 20);
        List<Producto> productos = cadena.getProductos();
        productos.add(productoImportado);
        List<ProductoImportado> productosImportados = cadena.obtenerProductosImportados();
        Assert.assertTrue(productosImportados.contains(productoImportado));
        Assert.assertEquals(1, productosImportados.size());
        Assert.assertTrue(cadena.obtenerProductosImportados().contains(productoImportado));
    }
    @Test
    public void testObtenerProductosPorDebajoExistencia() {
        Producto producto = new Producto( "004", "zapatilla", 5, 10, 15) {

            @Override
            public double calcularPrecioVenta() {
                return 0;
            }
        };
          List<Producto> productos = cadena.getProductos();
         productos.add(producto);
        List<Producto> productosBajoExistencia = cadena.obtenerProductosPorDebajoExistencia(20, "zapatilla");
        Assert.assertTrue(productosBajoExistencia.contains(producto));
        Assert.assertEquals(1, productosBajoExistencia.size());
        Assert.assertTrue(cadena.obtenerProductosPorDebajoExistencia(20, "zapatilla").contains(producto));
    }
     @Test
    public void testObtenerProductosVendidosACubaPorPais() {
        ProductoImportado pi = new ProductoImportado("Chile", 50, "007", "medias", 55, 77, 90);
        List<Producto> productos = cadena.getProductos();
        productos.add(pi);
        List<ProductoImportado> productosImportados = cadena.obtenerProductosImportados();
        List<ProductoImportado> vendidosACuba = cadena.obtenerProductosVendidosACubaPorPais("Chile");
        Assert.assertTrue(vendidosACuba.contains(pi));
        Assert.assertEquals(1, cadena.obtenerProductosVendidosACubaPorPais("Chile").size());
        Assert.assertTrue(cadena.obtenerProductosVendidosACubaPorPais("Chile").contains(pi));
    }
    
}

