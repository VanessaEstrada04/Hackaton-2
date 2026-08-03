package org.Generation.sala2;
import java.util.*;


public class Agenda {
    private int capacidadMax;
    private List<Contacto> contactos = new ArrayList<>();

    //constructores

//Constructor del contacto que el usuario agrega.
    public Agenda(int capacidadMax ) {
        this.capacidadMax = capacidadMax;
    }

//constructor por default
    public Agenda() {
        this.capacidadMax = 10;
    }

    // Metodo para saber si la agenda está llena
    public boolean agendaLlena() {
        if (contactos.size() >= capacidadMax) {
            System.out.println("No hay espacio disponible para nuevos contactos.");
            return true;
        }
        return false;
    }

    // Metodo para calcular cuántos espacios libres quedan
    public int espacioLibres() {
        int espacios = capacidadMax - contactos.size();
        return espacios;
    }
}