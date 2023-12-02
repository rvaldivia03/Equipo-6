/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ramses
 */
public class Cadena{
    
    private List<Almacen> almacenes;
    

    public void agregarAlmacen(Almacen a) {
        almacenes.add(a);
    }

}