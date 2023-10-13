package org.hotelmgt.hotel.entities;

import org.hotelmgt.hotel.entities.enums.Position;

import java.math.BigDecimal;
import java.time.LocalDate;

public class HotelStaff extends User{

    private int staffId;

    private Position position;
    private BigDecimal salary;
    private LocalDate dateOfEmployment;

}
