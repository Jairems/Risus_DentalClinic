package Modelo;

import java.io.Serializable;

public class Tratamiento_JB implements Serializable {
    private int r_idpaciente;
    private int r_idcitas;
    private String fecha_inicio;
    private String asistencia_cita;
    private String tipo_bracket;
    private String calibre_arco;
    private String tipo_arco;

    public Tratamiento_JB(){

    }

    public int getR_idpaciente() {
        return r_idpaciente;
    }

    public void setR_idpaciente(int r_idpaciente) {
        this.r_idpaciente = r_idpaciente;
    }

    public int getR_idcitas() {
        return r_idcitas;
    }

    public void setR_idcitas(int r_idcitas) {
        this.r_idcitas = r_idcitas;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getAsistencia_cita() {
        return asistencia_cita;
    }

    public void setAsistencia_cita(String asistencia_cita) {
        this.asistencia_cita = asistencia_cita;
    }

    public String getTipo_bracket() {
        return tipo_bracket;
    }

    public void setTipo_bracket(String tipo_bracket) {
        this.tipo_bracket = tipo_bracket;
    }

    public String getCalibre_arco() {
        return calibre_arco;
    }

    public void setCalibre_arco(String calibre_arco) {
        this.calibre_arco = calibre_arco;
    }

    public String getTipo_arco() {
        return tipo_arco;
    }

    public void setTipo_arco(String tipo_arco) {
        this.tipo_arco = tipo_arco;
    }

}

/*
IDTrat serial, --Podría ser combinada, para identificar mejor al cliente en relación al tratamiento
R_IDPaciente integer not null,
R_IDCitas integer not null,
Fecha_inicio date not null,
Asistencia_Cita varchar  not null,
Tipo_Bracket varchar not null,
Calibre_Arco varchar not null,
Tipo_Arco varchar not null,
 */