package be.pxl.ja.streamingservice.model;

import java.util.List;

public class Account {
    private String email;
    private String password;
    private StreamingPlan streamingPlan;
    private List<Profile> profiles;
    private PaymentInfo paymentInfo;

    Account(){
        profiles.add(new Profile("profile1", null));
    }

    public Profile getFirstProfile(){
        return profiles.get(0);
    }


}
