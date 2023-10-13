package org.hotelmgt.hotel.entities;

import org.hotelmgt.hotel.entities.enums.Gender;

import java.time.LocalDate;

public abstract class User {

    private String firstName;
    private String lastName;
    private Gender gender;
    private LocalDate dateOfBirth;
    private long phoneNumber;
    private String emailAddress;
    private String homeAddress;

}
