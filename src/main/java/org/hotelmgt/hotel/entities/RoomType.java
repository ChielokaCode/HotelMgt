package org.hotelmgt.hotel.entities;

import org.hotelmgt.hotel.entities.enums.RoomName;

import java.math.BigDecimal;

public class RoomType extends Room{

    private RoomName roomName;
    private String roomDescription;
    private BigDecimal pricePerNight;
    private RoomCapacity roomCapacity;


    //GETTERS AND SETTERS


    public RoomName getRoomName() {
        return roomName;
    }

    public void setRoomName(RoomName roomName) {
        this.roomName = roomName;
    }

    public String getRoomDescription() {
        return roomDescription;
    }

    public void setRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
    }

    public BigDecimal getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(BigDecimal pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public RoomCapacity getRoomCapacity() {
        return roomCapacity;
    }

    public void setRoomCapacity(RoomCapacity roomCapacity) {
        this.roomCapacity = roomCapacity;
    }
}
