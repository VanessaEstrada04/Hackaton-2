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

    //  METODO AÑADIR CONTACTO
    public void añadirContacto(Contacto contacto) {

        if (agendaLlena()) {
            System.out.println("La agenda está llena");
        } else if (existeContacto(contacto)) {
            System.out.println("El contacto ya existe.");
        } else {
            contactos.add(contacto);
            System.out.println("Contacto agregado correctamente.");
        }
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
    /*
    Arturo/listar
     */
    public void listarContactos() {
        if (contactos.isEmpty()) {
            System.out.println("La agenda no tiene contactos registrados.");
            return;
        }

        // Ordenar
        contactos.sort(Comparator.comparing(Contacto::getNombreCompleto));

        // Imprimir  Nombre Apellido - Teléfono
        System.out.println("=== Lista de Contactos ===");
        for (Contacto c : contactos) {
            System.out.println(c.getNombreCompleto() + " - " + c.getNumeroTelefono());
        }
    }


    }
}