package com.cinema.peliculas.math;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Pelicula {
    String titulo;
    List<Double> calificaciones = new ArrayList<>();

    Pelicula(String titulo) {
        this.titulo = titulo;
    }
}

public class CalculoPromedio {

    public static void main(String[] args) {
        List<Pelicula> peliculas = generarPeliculasConCalificaciones();

        double promedioGeneral = calculoPromedioImpl2(peliculas);
        System.out.println("Promedio general de valoración: " + promedioGeneral);
    }

    public static List<Pelicula> generarPeliculasConCalificaciones() {
        List<Pelicula> peliculas = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            Pelicula pelicula = new Pelicula("Pelicula " + (i + 1));
            for (int j = 0; j < 5; j++) {
                double calificacion = random.nextDouble() * 5; // Genera calificación entre 0 y 5
                pelicula.calificaciones.add(calificacion);
            }
            peliculas.add(pelicula);
        }

        return peliculas;
    }

    public static double calculoPromedioImpl2(List<Pelicula> peliculas) {
        double sumaTotalPromedios = 0;
        int numeroTotalPeliculas = peliculas.size();

        for (Pelicula pelicula : peliculas) {
            double promedioPonderado = calculoPromedioImpl(pelicula.calificaciones);
            System.out.println("Promedio ponderado de " + pelicula.titulo + ": " + promedioPonderado);
            sumaTotalPromedios += promedioPonderado;
        }

        return sumaTotalPromedios / numeroTotalPeliculas;
    }

    public static double calculoPromedioImpl(List<Double> calificaciones) {
        double sumaValoraciones = 0;
        int numeroValoraciones = calificaciones.size();

        for (Double calificacion : calificaciones) {
            sumaValoraciones += calificacion;
        }

        return sumaValoraciones / numeroValoraciones;
    }
}