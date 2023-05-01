package guía7_ejerciciosextras_1;

import Cancion.Cancion;
import java.util.Scanner;

public class Guía7_ejerciciosextras_1 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el título de una canción");
        String titulo = entrada.nextLine();
        System.out.println("Ingresa el autor");
        String autor = entrada.nextLine();
        Cancion cancion1 = new Cancion(titulo, autor);
        System.out.println(cancion1.toString());
    }
    
}
