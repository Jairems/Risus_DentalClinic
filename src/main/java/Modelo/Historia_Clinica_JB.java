package Modelo;

import java.io.Serializable;

public class Historia_Clinica_JB implements Serializable {
    private int r_idpaciente;
    private byte odontograma;
    private byte entrevista_med;
    private int r_idtrat;

    public Historia_Clinica_JB(){

    }

    public int getR_idpaciente() {
        return r_idpaciente;
    }

    public void setR_idpaciente(int r_idpaciente) {
        this.r_idpaciente = r_idpaciente;
    }

    public byte getOdontograma() {
        return odontograma;
    }

    public void setOdontograma(byte odontograma) {
        this.odontograma = odontograma;
    }

    public byte getEntrevista_med() {
        return entrevista_med;
    }

    public void setEntrevista_med(byte entrevista_med) {
        this.entrevista_med = entrevista_med;
    }

    public int getR_idtrat() {
        return r_idtrat;
    }

    public void setR_idtrat(int r_idtrat) {
        this.r_idtrat = r_idtrat;
    }
}

/*
ID_HC serial, --Podría ser combinada, para identificar mejor al cliente
R_IDPaciente integer not null,
Odontograma Bytea not null,
Entrevista_med Bytea not null,
R_IDTrat integer not null,
 */