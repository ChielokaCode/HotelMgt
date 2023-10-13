package org.hotelmgt.hotel.entities;

import org.hotelmgt.hotel.entities.enums.StarRating;

import java.time.LocalTime;

public class Hotel {

    private String hotelName;
    private String hotelAddress;
    private long hotelPhoneNumber;
    private String hotelEmailAddress;
    private StarRating starRating;
    private LocalTime checkInTime;
    private LocalTime checkOutTime;

    //GETTERS AND SETTERS


    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public long getHotelPhoneNumber() {
        return hotelPhoneNumber;
    }

    public void setHotelPhoneNumber(long hotelPhoneNumber) {
        this.hotelPhoneNumber = hotelPhoneNumber;
    }

    public String getHotelEmailAddress() {
        return hotelEmailAddress;
    }

    public void setHotelEmailAddress(String hotelEmailAddress) {
        this.hotelEmailAddress = hotelEmailAddress;
    }

    public StarRating getStarRating() {
        return starRating;
    }

    public void setStarRating(StarRating starRating) {
        this.starRating = starRating;
    }

    public LocalTime getCheckInTime() {
        return checkInTime;
    }

    public void setCheckInTime(LocalTime checkInTime) {
        this.checkInTime = checkInTime;
    }

    public LocalTime getCheckOutTime() {
        return checkOutTime;
    }

    public void setCheckOutTime(LocalTime checkOutTime) {
        this.checkOutTime = checkOutTime;
    }
}
