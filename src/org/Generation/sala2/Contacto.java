package org.Generation.sala2;

public class Contacto {
    private String primerNombre;
    private String primerApellido;
    private String numeroTelefono;

    public Contacto(String primerNombre, String primerApellido, String numeroTelefono){
        this.primerNombre = primerNombre;
        this.primerApellido = primerApellido;
        this.numeroTelefono = numeroTelefono;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }


    public String getNombreCompleto(){
        return String.format("%s %s",this.primerNombre,this.primerApellido);
    }
    public String getNumeroTelefono() {
        return this.numeroTelefono;
    }
}


