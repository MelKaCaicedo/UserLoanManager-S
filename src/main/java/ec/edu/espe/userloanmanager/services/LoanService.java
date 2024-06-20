package ec.edu.espe.userloanmanager.services;

import ec.edu.espe.userloanmanager.models.Loan;
import ec.edu.espe.userloanmanager.repositories.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoanService {

    private final LoanRepository loanRepository;

    @Autowired
    public LoanService(LoanRepository loanRepository) {
        this.loanRepository = loanRepository;
    }

    public List<Loan> getAllLoans() {
        return loanRepository.getAll();
    }

    public Optional<Loan> findLoanById(Long id) {
        return loanRepository.getOne(id);
    }

    public void createLoan(Loan loan) {
        loanRepository.addLoan(loan);
    }

    public void updateLoan(Long id, Loan updatedLoan) {
        loanRepository.updateLoan(id, updatedLoan);
    }

    public void deleteLoan(Long id) {
        loanRepository.deleteLoan(id);
    }
}
