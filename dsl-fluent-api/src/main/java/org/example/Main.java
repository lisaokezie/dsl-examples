package org.example;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // example patient
        final var patient = new Patient("max", "Mustermann")
                                    .birthdate(new Date())
                                    .email("max.mustermann@example.de")
                                    .insuranceNumber("123ABC")
                                    .insuranceType(Patient.InsuranceType.PRIVATE)
                                    .phoneNumber("+4912345678");
        System.out.println(patient);
    }
}