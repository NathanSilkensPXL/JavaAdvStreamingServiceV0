package be.pxl.ja.streamingservice.model;

public class Documentary extends Movie {

    public Documentary(String title, Rating rating) {
        super(title, rating);
        this.setGenre(Genre.DOCUMENTARY);
    }
}
