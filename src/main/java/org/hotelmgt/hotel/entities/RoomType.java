package org.hotelmgt.hotel.entities;

import org.hotelmgt.hotel.entities.enums.RoomName;

import java.math.BigDecimal;

public class RoomType extends Room{

    private RoomName roomName;
    private String roomDescription;
    private BigDecimal pricePerNight;
    private RoomCapacity roomCapacity;
}
