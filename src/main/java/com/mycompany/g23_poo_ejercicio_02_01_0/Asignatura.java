/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.g23_poo_ejercicio_02_01_0;

/**
 *
 * @author erika
 */
public class Asignatura {
    private String nombreAsignatura;
    private String nombreProfesor;
    private int numeroHoras;

    public Asignatura(String nombreAsignatura, String nombreProfesor, int numeroHoras) {
        this.nombreAsignatura = nombreAsignatura;
        this.nombreProfesor = nombreProfesor;
        this.numeroHoras = numeroHoras;
    }
    
    public int obtenerCosto (int costoHora){
        int retorno;
        retorno = costoHora * this.getNumeroHoras();
        return retorno;
        
    }
    
    

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public String getNombreProfesor() {
        return nombreProfesor;
    }

    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    public int getNumeroHoras() {
        return numeroHoras;
    }

    public void setNumeroHoras(int numeroHoras) {
        this.numeroHoras = numeroHoras;
    }
    
    
    
}
