package be.pxl.ja.streamingservice.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Uma", Rating.LITTLE_KIDS);
        Movie movie2 = new Movie("Upa", Rating.MATURE);

        movie1.setReleaseDate(LocalDate.now());
        movie1.setDirector("Jan zen ma");

        System.out.println(movie1.getDirector());
        System.out.println(movie1.toString());

        List<Content> contentList = new ArrayList<>();
        contentList.add(movie1);
        contentList.add(movie2);

        TVShow tvShow = new TVShow("Cobra Kai", Rating.TEENS, 2);
        contentList.add(tvShow);

        for(Content content : contentList){
            System.out.println(content);
            if(content instanceof Playable){
                ((Playable) content).play();
            }
            if(content instanceof Movie){
                ((Movie) content).pause();
            }
        }
    }
}
