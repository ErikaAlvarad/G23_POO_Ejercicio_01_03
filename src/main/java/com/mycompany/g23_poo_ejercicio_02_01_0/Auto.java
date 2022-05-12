/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.g23_poo_ejercicio_02_01_0;

/**
 *
 * @author erika
 */
public class Auto {
    private String color;
    private String modelo;
    private int costo;
    private Propietario propietario;
    private Matricula matricula;

    public Auto(String color, String modelo, int costo, Propietario propietario, Matricula matricula) {
        this.color = color;
        this.modelo = modelo;
        this.costo = costo;
        this.propietario = propietario;
        this.matricula = matricula;
    }

    
    public boolean esCostoso(int costoMaximo){
        var retorno = false;
        if (this.getCosto()> costoMaximo){
            retorno=true;
        }
        return retorno;
    }
    
    

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }
    
    
}
