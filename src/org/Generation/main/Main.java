package org.Generation.main;//objeto agenda,validar que no este la agenda llena, no pasarnos de la capacidad maxima.
import org.Generation.sala2.Agenda;

import java.util.Scanner;

public class Main{
    public static void main (String[] args) {

        boolean capacidadIncorrecta = true;
        Scanner scanner = new Scanner(System.in);
        int opcion;

        System.out.println("Presiona ENTER para iniciar...");
        scanner.nextLine();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

        System.out.println("Personaliza tu agenda: ");

        while (capacidadIncorrecta) {
            System.out.println("Ingresa la capacidad máxima: ");
            String respuesta = scanner.nextLine().trim();
            if (respuesta.equals("")) { //Si presiona ENTER sin escribir nada, usas el constructor por defecto (10)
                Agenda agenda = new Agenda();
                capacidadIncorrecta = false;
            } else {
                try {
                    int capacidadMax = Integer.parseInt(respuesta);
                    if (capacidadMax > 0) {
                        Agenda agenda = new Agenda(capacidadMax);
                        capacidadIncorrecta = false;
                    } else {
                        System.out.println("El valor no puede ser cero, intenta nuevamente.");
                        capacidadIncorrecta = true;
                    }
                } catch (Exception e) {
                    System.out.println("El valor es incorrecto, intenta nuevamente.");
                    capacidadIncorrecta = true;
                }
            }
        }

        do {
            System.out.println("\n===== MENÚ AGENDA =====");
            System.out.println("1. Añadir contacto");
            System.out.println("2. Verificar si existe contacto");
            System.out.println("3. Listar contactos");
            System.out.println("4. Buscar contacto por nombre");
            System.out.println("5. Eliminar contacto");
            System.out.println("6. Ver espacios libres y si la agenda está llena");
            System.out.println("7. Salir");
            System.out.print("Elige una opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                opcion = 0; //Opción invalida para que caida en dafault
            }

            switch (opcion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while(opcion != 7);

        scanner.close();
    }
}
