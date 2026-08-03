package org.Generation.sala2;
import java.util.Scanner;

public class Contacto {
    private String primerNombre;
    private String primerApellido;
    private int numeroTelefono;


    public Contacto(String primerNombre, String primerApellido, int numeroTelefono) {
        this.primerNombre = primerNombre;
        this.primerApellido = primerApellido;
        this.numeroTelefono = numeroTelefono;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
}