package co.unicauca.edu.application.ports.input;

import co.unicauca.edu.domain.model.Account;

public interface AddAccountUseCase {
    Account addAccount(Account account);
}
