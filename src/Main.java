package src;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenidos a la inmersion Java");
        // System.out.println("Pelicula Matrix lanzada");
        // Declaracion de variables
        int fechaDeLanzamiento = 1999; // Almacena la informacion en esta variable, int es un dato primitivo
        double evaluacion = 4.5; // variable de tipo double es un dato primitivo
        String nombre = "Matrix";// String es una clase, no es un dato primitivo, lo definimos como una variable
                                 // que almacene texto
        String sinopsis = """
                La mejor pelicula del fin del milenio
                """;
        boolean incluidoEnElPlanBasico = true;
        double mediaEvaluacionMatrix = 0.0;
        double contador = 0; 
        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US); 
        System.out.println("Pelicula: " + nombre);
        System.out.println("Sinopsis: " + sinopsis);
        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Calificacion: " + evaluacion);
        System.out.println("Plan Basico: " + incluidoEnElPlanBasico);
        double mediaEvaluacion = (4.5 + 4.8 + 3) / 3;
        System.out.println("Calficacion promedio" + mediaEvaluacion);
        if (fechaDeLanzamiento >= 2023) {
            System.out.println("Pelicula popular del momento");
            
        } else{ System.out.println("Pelicula retro que vale la pena ver");
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese la nota que le darías a Matrix");
            try {
                double notaMatrix = teclado.nextDouble();
                mediaEvaluacionMatrix += notaMatrix;
                contador++;
            } catch (InputMismatchException e) {
                System.out.println("Error: Por favor, ingrese un número válido.");
                teclado.next(); // Limpiar el buffer de entrada para evitar un bucle infinito si se produce un error
                i--; // Disminuyo el valor de i para volver a poner una nota
            }
        }
        teclado.close();
        double mediaEvaluacionFinal =  (mediaEvaluacionMatrix / contador);
            System.out.println("La media de la pelicula" +
            "Matrix calculada por el usuario es: " + mediaEvaluacionFinal); 
            System.out.println(mediaEvaluacionMatrix);
            System.out.println(contador);
        }
       
    }
