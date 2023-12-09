/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;


import interfaces.ICadena;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ramses
 */
public class Cadena implements ICadena{
    
    private List<Almacen> almacenes;
    
    @Override
    public void agregarAlmacen(Almacen a) {
        almacenes.add(a);
    }

}