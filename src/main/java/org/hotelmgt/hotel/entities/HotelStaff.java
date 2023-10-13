package org.hotelmgt.hotel.entities;

import org.hotelmgt.hotel.entities.enums.Position;

import java.math.BigDecimal;
import java.time.LocalDate;

public class HotelStaff extends User{

    private int staffId;
    private Position position;
    private BigDecimal salary;
    private LocalDate dateOfEmployment;


    //GETTERS AND SETTERS


    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public LocalDate getDateOfEmployment() {
        return dateOfEmployment;
    }

    public void setDateOfEmployment(LocalDate dateOfEmployment) {
        this.dateOfEmployment = dateOfEmployment;
    }
}
