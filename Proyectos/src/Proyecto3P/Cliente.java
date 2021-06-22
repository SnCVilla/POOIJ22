
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto3;

import java.util.List;

/**
 *
 * @author SamuelSnC
 */
public class Cliente {
    private int id;
    private String telefono;
    private int edad;
    private String correo;
    private String nombre;

    public Cliente() {
    }

    public Cliente(int id, String telefono, int edad, String correo, String nombre) {
        this.id = id;
        this.telefono = telefono;
        this.edad = edad;
        this.correo = correo;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

