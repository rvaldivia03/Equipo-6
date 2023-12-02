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
public abstract class Producto {
    
    protected String codigo; //Principio de Abierto/Cerrado
    protected String nombre;
    protected double precioCosto;
    protected double existencia;
    protected int cantidadDeVentas;

    public Producto(String codigo, String nombre, double precioCosto, double existencia, int cantidadDeVentas) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioCosto = precioCosto;
        this.existencia = existencia;
        this.cantidadDeVentas = cantidadDeVentas;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioCosto() {
        return precioCosto;
    }

    public double getExistencia() {
        return existencia;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecioCosto(double precioCosto) {
        this.precioCosto = precioCosto;
    }

    public void setExistencia(double existencia) {
        this.existencia = existencia;
    }

    public int getCantidadDeVentas() {
        return cantidadDeVentas;
    }

    public void setCantidadDeVentas(int cantidadDeVentas) {
        this.cantidadDeVentas = cantidadDeVentas;
    }

    public abstract double calcularPrecioVenta();
    }


