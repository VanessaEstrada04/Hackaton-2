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
    /*
    Arturo-listarContactos
     */
    public void listarContactos() {
        if (contactos.isEmpty()) {
            System.out.println("La agenda no tiene contactos registrados.");
            return;
        }

        // ordenar
        contactos.sort(Comparator.comparing(Contacto::getNombreCompleto));

        // Imprimir: Nombre Apellido - Teléfono
        System.out.println("*** Lista de Contactos ***");
        for (Contacto c : contactos) {
            System.out.println(c.getNombreCompleto() + " - " + c.getNumeroTelefono());
        }
    }
}