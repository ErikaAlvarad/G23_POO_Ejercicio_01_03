/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.g23_poo_ejercicio_02_01_0;

/**
 *
 * @author erika
 */
public class Propietario {
    private String nombre;
    private String cedula;
    private String direccion;
    private int yearNacimiento;

    public Propietario(String nombre, String cedula, String direccion, int yearNacimiento) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
        this.yearNacimiento = yearNacimiento;
    }

    
    public int obtenerEdad(int yearActual){
        int retorno;
        retorno = yearActual - this.getYearNacimiento();
        return retorno;
    }
    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getYearNacimiento() {
        return yearNacimiento;
    }

    public void setYearNacimiento(int yearNacimiento) {
        this.yearNacimiento = yearNacimiento;
    }
    
}
