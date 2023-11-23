package com.example.springsecurity.Models;

public class Usuario {

    String nombre;
    String apellido;

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = nombre;
    }

    public String getApellido(){
        return apellido;
    }


    public void setApellido(String apellido){
        this.apellido = apellido;
    }

}
