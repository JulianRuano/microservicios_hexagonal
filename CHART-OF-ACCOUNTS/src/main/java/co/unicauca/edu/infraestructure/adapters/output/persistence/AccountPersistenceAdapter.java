package co.unicauca.edu.infraestructure.adapters.output.persistence;

import co.unicauca.edu.application.ports.output.ChartOutputPort;
import co.unicauca.edu.domain.model.Account;
import co.unicauca.edu.infraestructure.adapters.output.persistence.entity.AccountEntity;
import co.unicauca.edu.infraestructure.adapters.output.persistence.mapper.AccountEntityMapper;
import org.hibernate.annotations.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Component;


@Component
public class AccountPersistenceAdapter implements ChartOutputPort {
    private final AccountRepository accountRepository;

    @Autowired
    public AccountPersistenceAdapter(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public Account createAccount(Account account) {
        AccountEntity accountEntity = AccountEntityMapper.INSTANCE.toEntity(account);
        accountEntity = accountRepository.save(accountEntity);
        return AccountEntityMapper.INSTANCE.toDomain(accountEntity);
    }
}
