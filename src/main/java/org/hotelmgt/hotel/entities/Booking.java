package org.hotelmgt.hotel.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Booking extends Room{

    private int bookingId;
    private int guestId;
    private LocalDateTime checkInTime;
    private LocalDateTime checkOutTime;
    private BigDecimal totalRoomPrice;

}
