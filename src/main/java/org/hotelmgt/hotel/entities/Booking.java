package org.hotelmgt.hotel.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Booking extends Room{

    private int bookingId;
    private int guestId;
    private LocalDateTime checkInTime;
    private LocalDateTime checkOutTime;
    private BigDecimal totalRoomPrice;

    //GETTERS AND SETTERS


    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public int getGuestId() {
        return guestId;
    }

    public void setGuestId(int guestId) {
        this.guestId = guestId;
    }

    public LocalDateTime getCheckInTime() {
        return checkInTime;
    }

    public void setCheckInTime(LocalDateTime checkInTime) {
        this.checkInTime = checkInTime;
    }

    public LocalDateTime getCheckOutTime() {
        return checkOutTime;
    }

    public void setCheckOutTime(LocalDateTime checkOutTime) {
        this.checkOutTime = checkOutTime;
    }

    public BigDecimal getTotalRoomPrice() {
        return totalRoomPrice;
    }

    public void setTotalRoomPrice(BigDecimal totalRoomPrice) {
        this.totalRoomPrice = totalRoomPrice;
    }
}
