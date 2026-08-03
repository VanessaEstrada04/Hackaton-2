package org.Generation.sala2;
import java.util.*;


public class Agenda {
    private int capacidadMax;
    private List<Contacto> contactos = new ArrayList<>();

    //constructores

    //Constructor del contacto que el usuario agrega.
    public Agenda(int capacidadMax) {
        this.capacidadMax = capacidadMax;

    }

    //constructor por defoult
    public Agenda() {
        this.capacidadMax = 10;

    }

    public boolean existeContacto(Contacto c) {
        if (c == null || c.getNombreCompleto() == null) {
            return false;
        }

        for (Contacto elemento : contactos) {
            if (c.getNombreCompleto().equalsIgnoreCase(elemento.getNombreCompleto())) {
                return true;
            }
        }
        return false;
    }

}