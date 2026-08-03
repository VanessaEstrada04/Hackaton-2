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
    //Metodo eliminarContacto
    public void eliminarContacto(Contacto c) {
        // Buscamos si existe en la lista comparando por nombre y apellido
        Contacto contactoEncontrado = null;

        for (Contacto contactoActual : contactos) {
            if (contactoActual.getNombreCompleto().equalsIgnoreCase(c.getNombreCompleto())) {
                contactoEncontrado = contactoActual;
                break;
            }
        }
        if (contactoEncontrado != null) {
            contactos.remove(contactoEncontrado);
            System.out.println("El contacto se ha eliminado exitosamente.");
        } else {
            System.out.println("No se pudo eliminar: El contacto no existe en la agenda.");
        }
    }
    // 2. Método modificar telefono
    public void modificarTelefono(String nombre, String apellido, String nuevoTelefono) {
        String nombreBuscado = nombre + " " + apellido;

        for (Contacto contactoActual : contactos) {
            if (contactoActual.getNombreCompleto().equalsIgnoreCase(nombreBuscado)) {
                contactoActual.setNumeroTelefono(nuevoTelefono);
                System.out.println("Teléfono actualizado exitosamente.");
                return;
            }
        }
        System.out.println("No se pudo modificar: El contacto no existe en la agenda.");
    }
}


