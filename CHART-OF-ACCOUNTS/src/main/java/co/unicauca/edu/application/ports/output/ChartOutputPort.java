package co.unicauca.edu.application.ports.output;

import co.unicauca.edu.domain.model.Account;

public interface ChartOutputPort {
    Account createAccount(Account account);
}
