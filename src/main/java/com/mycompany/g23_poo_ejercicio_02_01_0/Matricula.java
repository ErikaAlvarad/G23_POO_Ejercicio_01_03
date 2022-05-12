/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.g23_poo_ejercicio_02_01_0;

/**
 *
 * @author erika
 */
public class Matricula {
    private String codigo;
    private String lugarMatricula;
    private int yearMatricula;

    public Matricula(String codigo, String lugarMatricula, int yearMatricula) {
        this.codigo = codigo;
        this.lugarMatricula = lugarMatricula;
        this.yearMatricula = yearMatricula;
    }

    public boolean modeloActual(){
        var retorno = false;
        if (this.getYearMatricula()>2018){
            retorno= true;
        }
        return retorno;
    }
  
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getLugarMatricula() {
        return lugarMatricula;
    }

    public void setLugarMatricula(String lugarMatricula) {
        this.lugarMatricula = lugarMatricula;
    }

    public int getYearMatricula() {
        return yearMatricula;
    }

    public void setYearMatricula(int yearMatricula) {
        this.yearMatricula = yearMatricula;
    }
    
}
