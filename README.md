# Programacion_Cliente_Servidor_SC-303_practicaN2

## Consigna

Práctica Programada 2: Polimorfismo, Excepciones y Colecciones (Valor 4%)

## Descripción

La práctica programada tiene como finalidad desarrollar un aprendizaje puntual relacionado con los temas vistos en clase. El objetivo es integrar los conocimientos adquiridos relacionados con los conceptos de Polimorfismo, Excepciones y el uso de Colecciones.

La empresa **“Fideflix”** lo ha contratado para crear una prueba de concepto de su nueva plataforma. Desean poder crear una aplicación para que las personas puedan ver la información de sus series, películas, documentales, etc., y poder ver qué piensa la gente sobre ellas (comentarios), ver las clasificaciones, etc.

La empresa se encuentra muy feliz por el primer avance presentado para la aplicación, pero es necesario continuar desarrollando la solución. Por tanto:

## INSTRUCCIONES

> **PARA LA EJECUCIÓN DE LOS SIGUIENTES PASOS ES NECESARIO CONTAR CON LA SOLUCIÓN A LA PRIMERA PRÁCTICA PROGRAMADA DEL CURSO.**

- [x] Convierta la clase `Audiovisual` en una clase abstracta.
- [x] En la clase `Audiovisual` cree un atributo de tipo colección `ArrayList` de `Strings` para almacenar los comentarios de los usuarios.
- [x] Cree en la clase `Audiovisual` un método estático llamado `Agregar Comentario` que toma como parámetro un `String` (comentario). El método debe tomar el `String` recibido como parámetro y agregarlo a la colección.
- [x] Implemente en la clase `Usuario` la interfaz `Comparable`, de modo que pueda crear colecciones de este tipo de clase y pueda utilizar los métodos que proveen estas clases.
- [x] Implemente en las clases `Serie`, `Documental` y `Pelicula` la interfaz `Comparable`, de modo que pueda crear colecciones de este tipo de clases y pueda utilizar los métodos que proveen estas clases.
- [x] En el `main` de su proyecto instancie una colección de `Usuarios` y agregue a esta colección al menos **10 objetos** de la clase `Usuario` (diferentes).
- [x] Utilice el método `remove` para eliminar un determinado `Usuario`.
- [x] Si un determinado usuario no existe dentro de la colección, lance una excepción de su autoría para sobrellevar este problema.
- [x] Utilice el método `sort` para ordenar los elementos de la colección de `Usuarios`.

- Recuerde, al finalizar su programa, ejecutar la destrucción de los objetos que fueron creados.
- El ejercicio debe ser ejecutado de manera individual.
- Puede utilizar el IDE de su preferencia, pero se recomienda el uso de **NetBeans IDE**.
- Deberá subir un archivo comprimido con las fuentes que permiten dar solución al problema, las cuales se espera que al menos incluyan (y no se limitan a):
  - `Audiovisual.java`
  - `Pelicula.java`
  - `Documental.java`
  - `Serie.java`
  - `Usuario.java`
  - `Main.java` *(el nombre de este archivo puede variar en su solución)*
