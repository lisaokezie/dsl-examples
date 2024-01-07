package org.example;

import java.util.Date;

public class Patient {
    public enum InsuranceType {
        PRIVATE,
        COMPULSORY
    }

    private String givenName;
    private String surname;
    private Date birthdate;
    private String email;
    private String phoneNumber;
    private String insuranceNumber;
    private InsuranceType insuranceType;

    public Patient(String givenName, String surname) {
        this.givenName = givenName;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Patient{" +
                       "givenName='" + givenName + '\'' +
                       ", surname='" + surname + '\'' +
                       ", birthdate=" + birthdate +
                       ", email='" + email + '\'' +
                       ", phoneNumber='" + phoneNumber + '\'' +
                       ", insuranceNumber='" + insuranceNumber + '\'' +
                       ", insuranceType=" + insuranceType +
                       '}';
    }

    public Patient birthdate(Date birthdate) {
        this.birthdate = birthdate;
        return this;
    }

    public Patient email(String email) {
        this.email = email;
        return this;
    }

    public Patient phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public Patient insuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
        return this;
    }

    public Patient insuranceType(final InsuranceType insuranceType) {
        this.insuranceType = insuranceType;
        return this;
    }
}
