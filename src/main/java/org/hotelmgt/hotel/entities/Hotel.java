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
}
