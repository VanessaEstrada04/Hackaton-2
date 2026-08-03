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
}