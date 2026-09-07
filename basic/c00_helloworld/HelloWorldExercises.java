package basic.c00_helloworld;

/*
Clase 14 - Ejercicios: Primeros pasos
Vídeo: https://youtu.be/JOAqpdM36wI?t=5108
*/

public class HelloWorldExercises {

    public static void main (String[] args) {

        // 1. Imprime un mensaje que diga tu nombre en lugar de "¡Hola Mundo!".
        System.out.println("Aldo Antonio Serrano Ramirez");

        // 2. Imprime dos líneas: "Hola" y luego "Mundo" con un solo println.
        System.out.println("Hola\nMundo");

        // 3. Añade un comentario sobre lo que hace cada línea del programa.
        // LA PRIMERA LÍNEA DE CÓDIGO IMPRIME EN PANTALLA MI NOMBRE Y LA SEGUNDA LÍNEA DE CÓDIGO IMPRIME UN SALUDO CON UN SALTO DE LÍNEA USANDO UN SOLO println

        // 4. Crea un comentario en varias líneas.
        /*
        -------------HOLA------------------
        ---------------QUE----------------
        ------------------HACE-------------
         */

        // 5. Imprime tu edad, tu color favorito y tu ciudad.
        System.out.println("Edad: 28 años, Color Favorito: Azul Marino, Ciudad: Guadalajara");

        // 6. Explora los diferentes System.XXX.println(); más allá de "out".
        System.err.println("Este es un mensaje de error");
    
        // 7. Utiliza varios println para imprimir una frase.
        System.out.println("HOLA");
        System.out.println("COMO");
        System.out.println("ESTAS");
        System.out.println(", YO MUY BIEN");

        // 8. Imprime un diseño ASCII (por ejemplo, una cara feliz usando símbolos).
        System.out.println("""
                           (•‿•)
                """);

        // 9. Intenta ejecutar el programa sin el método main y observa el error.

        //10. Intenta cambiar el nombre del archivo a uno diferente del de la clase y compílalo. ¿Qué pasa?

    }
}