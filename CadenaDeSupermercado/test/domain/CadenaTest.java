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
   
    
}
