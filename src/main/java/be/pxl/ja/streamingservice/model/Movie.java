package be.pxl.ja.streamingservice.model;

import java.time.LocalDate;

public class Movie extends Content {
    private String title;
    private String director;
    private LocalDate releaseDate;
    private int duration;
    private Genre genre;
    private Rating rating;

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public Movie(String title, Rating rating) {
        super(title, rating);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        String string = "";
        if(releaseDate != null){
            string = title + " " + getReleaseDate().getYear();
        }else{
            string = title;
        }
        return string;
    }

}
