package Modelo;

import java.io.Serializable;

public class Citas_JB implements Serializable {
    private int r_idpaciente;
    private String fecha;
    private String hora;
    private String cita_previa;

    public Citas_JB(){

    }

    public int getR_idpaciente() {
        return r_idpaciente;
    }

    public void setR_idpaciente(int r_idpaciente) {
        this.r_idpaciente = r_idpaciente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getCita_previa() {
        return cita_previa;
    }

    public void setCita_previa(String cita_previa) {
        this.cita_previa = cita_previa;
    }
}

/*
ID_c serial,
R_IDPaciente integer not null,
Fecha date not null,
Hora time not null,
Cita_Previa date,
 */