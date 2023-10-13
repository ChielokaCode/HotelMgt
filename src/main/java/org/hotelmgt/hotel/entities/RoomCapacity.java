package org.hotelmgt.hotel.entities;

import org.hotelmgt.hotel.entities.enums.NumberOfAdults;
import org.hotelmgt.hotel.entities.enums.NumberOfChildren;

public class RoomCapacity {

    private NumberOfAdults noOfAdults;
    private NumberOfChildren noOfChildren;

    //GETTERS AND SETTERS


    public NumberOfAdults getNoOfAdults() {
        return noOfAdults;
    }

    public void setNoOfAdults(NumberOfAdults noOfAdults) {
        this.noOfAdults = noOfAdults;
    }

    public NumberOfChildren getNoOfChildren() {
        return noOfChildren;
    }

    public void setNoOfChildren(NumberOfChildren noOfChildren) {
        this.noOfChildren = noOfChildren;
    }
}
