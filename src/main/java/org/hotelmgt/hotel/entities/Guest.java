package org.hotelmgt.hotel.entities;

public class Guest extends User{

    private int guestId;
    private String occupation;


    //GETTERS AND SETTERS


    public int getGuestId() {
        return guestId;
    }

    public void setGuestId(int guestId) {
        this.guestId = guestId;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
