package be.pxl.ja.streamingservice.model;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        be.pxl.ja.opdracht1.Movie movie1 = new be.pxl.ja.opdracht1.Movie("Uma", Rating.LITTLE_KIDS);
        be.pxl.ja.opdracht1.Movie movie2 = new be.pxl.ja.opdracht1.Movie("Upa", Rating.MATURE);

        movie1.setReleaseDate(LocalDate.now());
        movie1.setDirector("Jan zen ma");

        System.out.println(movie1.getDirector());
        System.out.println(movie1.toString());

    }
}
