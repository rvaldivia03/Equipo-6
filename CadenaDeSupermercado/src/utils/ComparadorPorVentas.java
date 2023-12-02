/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utils;

import domain.Producto;
import java.util.Comparator;

/**
 *
 * @author Ramses
 */
public class ComparadorPorVentas implements Comparator<Producto> {

    @Override
    public int compare(Producto o1, Producto o2) {
        return o1.getCantidadDeVentas() - o2.getCantidadDeVentas();
    }
    
}
