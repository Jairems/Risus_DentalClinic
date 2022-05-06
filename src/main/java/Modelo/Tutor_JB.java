package Modelo;

import java.io.Serializable;

public class Tutor_JB implements Serializable {
    private String nombre;
    private String ap_paterno;
    private String ap_materno;
    private String celular;
    private String direccion;

    public Tutor_JB(){

    }

    public String getNombre() {
        return nombre;
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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
/*ID_t serial,
Nombre Nom not null,
Celular varchar not null,
Direccion varchar(40) not null,
CONSTRAINT PK_ID_Tutor PRIMARY KEY (ID_t)*/