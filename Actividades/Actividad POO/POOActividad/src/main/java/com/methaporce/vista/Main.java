package com.methaporce.vista;

import com.methaporce.modelo.Pelicula;
import com.methaporce.modelo.GestionPelicula;

public class Main {
    public static void main(String[] args) {
        GestionPelicula gestor = new GestionPelicula();

        Pelicula pelicula1 = new Pelicula(1, "Deadpool");
        Pelicula pelicula2 = new Pelicula(2, "Avengers");
        Pelicula pelicula3 = new Pelicula(3, "Número 4");
        Pelicula pelicula4 = new Pelicula(4, "Avatar");

        gestor.agregarPelicula(pelicula1);
        gestor.agregarPelicula(pelicula2);
        gestor.agregarPelicula(pelicula3);
        gestor.agregarPelicula(pelicula4);

        System.out.println("Lista de películas:");
        for (Pelicula pelicula : gestor.obtenerPeliculas()) {
            System.out.println(pelicula);
        }

        // Eliminar una película
        gestor.eliminarPelicula(2);

        System.out.println("\nLista de películas después de eliminar la película Avengers:");
        for (Pelicula pelicula : gestor.obtenerPeliculas()) {
            System.out.println(pelicula);
        }

        // Marcar una película como no disponible
        gestor.marcarPeliculaComoNoDisponible("Número 4");

        System.out.println("\nLista de películas no disponibles:");
        for (Pelicula pelicula : gestor.obtenerPeliculas()) {
            System.out.println(pelicula);
        }

        // Marcar una película como disponible
        gestor.marcarPeliculaComoDisponible(3);

        System.out.println("\nLista de películas después de marcar la película Número 4 como disponible:");
        for (Pelicula pelicula : gestor.obtenerPeliculas()) {
            System.out.println(pelicula);
        }
    }
}