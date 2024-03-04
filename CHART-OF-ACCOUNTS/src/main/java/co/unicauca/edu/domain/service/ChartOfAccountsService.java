package co.unicauca.edu.domain.service;

import co.unicauca.edu.application.ports.input.AddAccountUseCase;
import co.unicauca.edu.application.ports.output.ChartOutputPort;
import co.unicauca.edu.domain.model.Account;
import org.springframework.stereotype.Service;

@Service
public class ChartOfAccountsService implements AddAccountUseCase {
    private final ChartOutputPort chartOutputPort;

    public ChartOfAccountsService(ChartOutputPort chartOutputPort) {
        this.chartOutputPort = chartOutputPort;
    }
    @Override
    public Account addAccount(Account account) {
        account.setTenantId(1L);//Este se debe extraer del userclaims
        return this.chartOutputPort.createAccount(account);
    }
}
