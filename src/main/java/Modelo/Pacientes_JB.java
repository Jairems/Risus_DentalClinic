package Modelo;

import java.io.Serializable;

public class Pacientes_JB implements Serializable {
    private String nombre;
    private String ap_paterno;
    private String ap_materno;
    private int edad;
    private String direccion;
    private String ciudad;
    private String num_celular;
    private int r_tutor;

    public Pacientes_JB(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAp_paterno() {
        return ap_paterno;
    }

    public void setAp_paterno(String ap_paterno) {
        this.ap_paterno = ap_paterno;
    }

    public String getAp_materno() {
        return ap_materno;
    }

    public void setAp_materno(String ap_materno) {
        this.ap_materno = ap_materno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getNum_celular() {
        return num_celular;
    }

    public void setNum_celular(String num_celular) {
        this.num_celular = num_celular;
    }

    public int getR_tutor() {
        return r_tutor;
    }

    public void setR_tutor(int r_tutor) {
        this.r_tutor = r_tutor;
    }
}

/*
ID_P serial,
Nombre Nom not null,
Edad integer not null,
Direccion varchar(40) not null,
Ciudad varchar(40) not null,
Numero_Cel varchar,
R_Tutor integer not null,*/