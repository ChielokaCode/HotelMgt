package org.hotelmgt.hotel.entities;

import org.hotelmgt.hotel.entities.enums.Status;

public class Room {

    private int roomNumber;
    private Status status;

    //GETTERS AND SETTERS


    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
