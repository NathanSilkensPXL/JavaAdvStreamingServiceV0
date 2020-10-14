package be.pxl.ja.streamingservice.model;

import java.time.LocalDate;
import java.time.Period;

public class Profile {
    private String name;
    private LocalDate dateOfBirth;

    Profile(String name, LocalDate dateOfBirth){
        this.name = name;
        if(dateOfBirth != null){
            this.dateOfBirth = dateOfBirth;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge(){
        if(dateOfBirth != null){
            Period period = Period.between(dateOfBirth, LocalDate.now());
            return period.getYears();
        }
        else{
            return 0;
        }
    }

    public boolean allowedToWatch(Content content) {
        if (dateOfBirth != null) {
            Period period = Period.between(dateOfBirth, LocalDate.now());
            int age = period.getYears();
            if (content.getMaturityRating().getAge() > age || dateOfBirth == null) {
                return false;
            } else {
                return true;
            }
        }else{
            return false;
        }
    }
}
