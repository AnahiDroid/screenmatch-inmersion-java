import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenidos a Screenmatch");
        //System.out.println("Pelicula El Quinto Elemento");

        int fechaDeLanzamiento = 1997;
        double evaluacion = 4.8;
        boolean incluidoEnElPlanBasico = true;
        String nombre = "El Quinto Elemento";
        String sinopsis = """
                Un elemento que no esta hecho ni de fuego, ni de aire, ni de agua, ni de tierra, sino que es una anti-energia, la anti-vida: el quinto elemento
                """;
        double mediaPuntuacionUsuario = 0;

        System.out.println("Pelicula: " + nombre);
        System.out.println(fechaDeLanzamiento);
        System.out.println(evaluacion);
        System.out.println(incluidoEnElPlanBasico);

        double mediaEvaluacion = (4.+8 + 3.1 + 4 + 4.5 + 5) / 5;
        System.out.println("Media de la evaluacion El Quinto Elemento: " + mediaEvaluacion);

        if (fechaDeLanzamiento >= 2023) {
            System.out.println("Pelicula popular en el momento");
        } else {
            System.out.println("Pelicula Retro que vale la pena ver");
        }

        //PRIMER DESAFIO CICLO WHILE
        double puntaje = 0;
        int i = 0;
        while (i < 10) {
            i++;
            Scanner teclado = new Scanner(System.in);
            System.out.println("Que puntaje le das a El Quinto Elemento: " + i);
            puntaje = puntaje + teclado.nextDouble();
        }
        double puntajeFinal = puntaje / 10;
        System.out.println("Puntaje promedio: " + puntajeFinal);
        //comentario
    }
}