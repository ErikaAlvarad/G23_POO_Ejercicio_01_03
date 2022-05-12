/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.g23_poo_ejercicio_02_01_0;

/**
 *
 * @author erika
 */
public class G23_POO_Ejercicio_02_01_0 {

    public static void main(String[] args) {
        var propietario = new Propietario("Juan","0109020392", "Calle Vieja",1998);
        var matricula = new Matricula ("ABD00981","Azuay",2020);
        var auto = new Auto("Negro","Ford",20000,propietario,matricula);
        
        System.out.println("El auto de color "+auto.getColor()+ " de marca "
                +auto.getModelo()+" tiene la siguiente matricula "
                +matricula.getCodigo());
        
        System.out.println("El auto le pertence a: "+ propietario.getNombre()
        + " con cedula numero: "+ propietario.getCedula()+" Tiene: "
        +propietario.obtenerEdad(2022)+ " años");
        
        System.out.println("Es un modelo actual: "+matricula.modeloActual()+
                " Es costoso: "+auto.esCostoso(15000));
      
        
        
        System.out.println("-------------------------------------");
        
        
        var estudiante = new Estudiante ("Juan Diego",14,"0140393892");
        var materia = new Asignatura ("Matematica", "Mateo Carpio",27);
        var calificacion = new Calificacion (65,materia,estudiante);
        
        System.out.println("El estudiante "+estudiante.getNombre()
                + " se encuentra estudiando en: "+estudiante.escuelaoColegio());
        
        System.out.println("El estudiante toma la materia de "
                +materia.getNombreAsignatura()+" con el profesor "
                +materia.getNombreProfesor()+" el cual gana: "
                +materia.obtenerCosto(3)+" dolares por dar esta materia");
        
        System.out.println("El estudiante obtuvo una calificaion de "
                +calificacion.getValor()
                +" Aprueba la materia: "+calificacion.apruebaAsignatura(70));
        
    }
}
