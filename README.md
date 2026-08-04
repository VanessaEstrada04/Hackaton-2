# Hackathon 2 - Agenda de Contactos

## Descripción

Este proyecto consiste en desarrollar una Agenda de Contactos en Java utilizando Programación Orientada a Objetos y `ArrayList`.

La aplicación funciona mediante un menú en consola que permite administrar contactos, evitando registros duplicados y controlando la capacidad máxima de la agenda.

## Funcionalidades

- Agregar un contacto.
- Verificar si un contacto ya existe.
- Listar todos los contactos registrados.
- Buscar un contacto por nombre.
- Eliminar un contacto.
- Verificar si la agenda está llena.
- Mostrar los espacios disponibles en la agenda.

## Reglas de funcionamiento

- No se permiten contactos duplicados (se compara por nombre).
- Si la agenda está llena, no se podrán agregar más contactos.
- Al eliminar un contacto, se informa si la operación fue exitosa.
- La búsqueda muestra el número telefónico del contacto encontrado.

## Capacidad de la agenda

La aplicación solicita al usuario la capacidad máxima de la agenda al iniciar.

**Importante:** Si el usuario simplemente presiona **ENTER** cuando se solicita la capacidad, la agenda utilizará una **capacidad máxima predeterminada de 10 contactos**.

## Tecnologías utilizadas

- Java
- Programación Orientada a Objetos (POO)
- ArrayList
- Scanner

## Estructura del proyecto

- `Contacto.java` → Clase que representa un contacto.
- `Agenda.java` → Contiene la lógica de la agenda.
- `Main.java` → Menú principal y ejecución del programa.

