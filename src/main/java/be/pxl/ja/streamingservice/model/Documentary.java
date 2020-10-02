package be.pxl.ja.streamingservice.model;

public class Documentary extends be.pxl.ja.opdracht1.Movie {

    public Documentary(String title, be.pxl.ja.opdracht1.Rating rating) {
        super(title, rating);
        this.setGenre(Genre.DOCUMENTARY);
    }
}
