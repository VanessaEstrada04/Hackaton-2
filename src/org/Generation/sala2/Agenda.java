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
        System.out.println("Los espacios libres son " + espacios);
        return espacios;
    }

    public boolean existeContacto(Contacto c) {
        if (c == null || c.getNombreCompleto() == null) {
            return false;
        }

        for (Contacto elemento : contactos) {
            if (c.getNombreCompleto().equalsIgnoreCase(elemento.getNombreCompleto())) {
                System.out.println("El contacto SÍ existe en la agenda.");
                return true;
            }
        }
        System.out.println("El contacto NO existe en la agenda.");
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



    public Contacto buscarContacto(String nombre, String apellido) {
        for (Contacto c : contactos){
            if (c.getPrimerNombre().equalsIgnoreCase(nombre) &&
                    c.getPrimerApellido().equalsIgnoreCase(apellido)){
                System.out.println("Contacto encontrado: " + c.getNombreCompleto() + " - " + c.getNumeroTelefono());
                return c;
            }
        }
        System.out.println("No se encontró ningún contacto con ese nombre.");
        return null;
    }

    //Sección de cris
    // Metodo eliminarContacto
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
    //  Método modificar telefono
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