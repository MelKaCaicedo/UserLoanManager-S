package ec.edu.espe.userloanmanager.models;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Loan {
    private Long id;
    private String userId;  // cedula del usuario
    private String userName;
    private String userLastName;
    private String bookIsbn;
    private String bookTitle;
    private String bookAuthor;
    private LocalDate loanDate;
    private LocalDate returnDate;
    private String status;
    private String notes;
}
