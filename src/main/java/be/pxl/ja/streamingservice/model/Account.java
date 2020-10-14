package be.pxl.ja.streamingservice.model;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private String email;
    private String password;
    private StreamingPlan streamingPlan;
    private List<Profile> profiles;
    private PaymentInfo paymentInfo;

    public Account(String email, String password){
        this.email = email;
        this.password = password;
        profiles = new ArrayList<>();
        profiles.add(new Profile("profile1", null));
    }

    public Profile getFirstProfile(){
        return profiles.get(0);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public StreamingPlan getStreamingPlan() {
        return streamingPlan;
    }

    public void setStreamingPlan(StreamingPlan streamingPlan) {
        this.streamingPlan = streamingPlan;
    }

    public void addProfile(Profile profile) {
        profiles.add(profile);
    }

    public PaymentInfo getPaymentInfo() {
        return paymentInfo;
    }

    public void setPaymentInfo(PaymentInfo paymentInfo) {
        this.paymentInfo = paymentInfo;
    }

    public boolean verifyPassword(String password){
        return true;
    }
}
