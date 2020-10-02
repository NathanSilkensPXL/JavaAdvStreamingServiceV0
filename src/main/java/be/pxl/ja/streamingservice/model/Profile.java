package be.pxl.ja.streamingservice.model;

import java.time.LocalDate;
import java.time.Period;

public class Profile {
    private String name;
    private LocalDate dateOfBirth;

    Profile(String name, LocalDate dateOfBirth){
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public boolean allowedToWatch(Content content){
        Period period = Period.between(dateOfBirth, LocalDate.now());
        int age = period.getYears();
        if(content.getMaturityRating().getAge() > age || dateOfBirth == null){
            return false;
        }else{
            return true;
        }
    }
}
