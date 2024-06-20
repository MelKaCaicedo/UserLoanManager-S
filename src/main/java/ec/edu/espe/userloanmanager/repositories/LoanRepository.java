package ec.edu.espe.userloanmanager.repositories;


import ec.edu.espe.userloanmanager.models.Loan;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class LoanRepository {
    private List<Loan> loans = new ArrayList<>();
    private Long nextId = 1L;

    public List<Loan> getAll() {
        return new ArrayList<>(loans);
    }

    public Optional<Loan> getOne(Long id) {
        return loans.stream()
                .filter(loan -> loan.getId().equals(id))
                .findFirst();
    }

    public void addLoan(Loan loan) {
        loan.setId(nextId++);
        loans.add(loan);
    }

    public void updateLoan(Long id, Loan updatedLoan) {
        for (int i = 0; i < loans.size(); i++) {
            if (loans.get(i).getId().equals(id)) {
                updatedLoan.setId(id);
                loans.set(i, updatedLoan);
                return;
            }
        }
    }

    public void deleteLoan(Long id) {
        loans.removeIf(loan -> loan.getId().equals(id));
    }
}
