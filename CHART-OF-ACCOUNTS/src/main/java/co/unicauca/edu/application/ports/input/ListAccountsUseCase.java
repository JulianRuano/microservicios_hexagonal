package co.unicauca.edu.application.ports.input;

import co.unicauca.edu.domain.model.Account;

import java.util.List;

public interface ListAccountsUseCase {
    List<Account> listAccounts();
}
