/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author User
 */
public class Persona implements Comparable<Persona>{
    
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    private String nombre;
    private int edad;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

   

    public String toString() {
        return "Persona [nombre=" + this.nombre + ", edad=" + this.edad + "]";
    }
    
    
    public int compareTo(Persona o) {
        int compEdad = Integer.compare(this.edad, o.getEdad());
        if (compEdad != 0) {
            return compEdad;
        } else {
            int compNombre = this.nombre.compareTo(o.getNombre());
            return compNombre;
        }
    }
}
