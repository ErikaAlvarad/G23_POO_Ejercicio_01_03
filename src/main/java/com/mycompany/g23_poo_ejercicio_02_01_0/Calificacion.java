/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.g23_poo_ejercicio_02_01_0;

/**
 *
 * @author erika
 */
public class Calificacion {
    private int valor;
    private Asignatura materia;
    private Estudiante alumno;

    public Calificacion(int valor, Asignatura materia, Estudiante alumno) {
        this.valor = valor;
        this.materia = materia;
        this.alumno = alumno;
    }
    
    
    public boolean apruebaAsignatura(int minimaCalificacion){
        var retorno = false;
        if (this.getValor()> minimaCalificacion){
            retorno = true;
        }
        return retorno;
    }
    
    
    

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    
}
