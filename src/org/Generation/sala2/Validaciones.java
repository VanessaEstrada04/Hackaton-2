package org.Generation.sala2;
import java.util.*;
public class Validaciones {

    public static String leerCampoNoVacio(Scanner scanner, String mensaje) {
        String input;
        do {
            System.out.println(mensaje);
            input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Este campo no puede estar vacío.");
            }
        } while (input.isEmpty());
        return input;
    }

    public static String leerTelefonoValido(Scanner scanner) {
        String telefono;
        while (true) {
            System.out.println("Ingresa un número telefónico (10 dígitos):");
            telefono = scanner.nextLine().trim();
            if (telefono.matches("\\d{10}")) {
                return telefono;
            }
            System.out.println("Teléfono inválido. Debe contener exactamente 10 números sin espacios ni letras.");
        }
    }

}
