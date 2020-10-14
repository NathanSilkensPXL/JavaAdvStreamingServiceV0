package be.pxl.ja.streamingservice.model;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class Movie extends Content implements Playable {
    public static final int LONG_PLAYING_TIME = 2*60+15;

    private String title;
    private String director;
    private LocalDate releaseDate;
    private int duration;
    private Genre genre;
    private Rating maturityRating;

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Rating getRating() {
        return maturityRating;
    }

    public void setRating(Rating maturityRating) {
        this.maturityRating = maturityRating;
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
        this.duration = Math.abs(duration);
    }

    public boolean isLongPlayingTime(){
        return duration >= LONG_PLAYING_TIME;
    }

    public String getPlayingTime(){
        if(duration == 0){
            return "?";
        }else if(duration <60){
            return duration + " mins";
        }else if((duration % 60) == 0){
            return duration + " hrs";
        }else{
            return duration / 60 + " hrs " + duration % 60 + " mins";
        }
    }

    @Override
    public String toString() {
        String string = "";
        if (releaseDate != null) {
            string = title + " " + getReleaseDate().getYear();
        } else {
            string = title;
        }
        return string;
    }

    @Override
    public void play() {
        System.out.println("Playing " + this);
    }

    @Override
    public void pause() {
        System.out.println("Pausing " + this);
    }

}
