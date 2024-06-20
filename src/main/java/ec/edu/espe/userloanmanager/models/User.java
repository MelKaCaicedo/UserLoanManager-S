package ec.edu.espe.userloanmanager.models;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class User {
    private Long id;
    private String name;
    private String email;
    private LocalDate birthdate;
    private String address;
    private String phoneNumber;
    private String identificationNumber;  // cedula
}
