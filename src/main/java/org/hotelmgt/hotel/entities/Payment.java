package org.hotelmgt.hotel.entities;

import org.hotelmgt.hotel.entities.enums.PaymentMethod;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Payment extends Booking{
    private int paymentId;
    private int guestId;
    private LocalDateTime paymentDateTime;
    private PaymentMethod paymentMethod;
}
