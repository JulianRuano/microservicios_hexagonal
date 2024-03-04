package co.unicauca.edu.infraestructure.adapters.output.persistence.mapper;

import co.unicauca.edu.domain.model.Account;
import co.unicauca.edu.infraestructure.adapters.output.persistence.entity.AccountEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface AccountEntityMapper {
    AccountEntityMapper INSTANCE = Mappers.getMapper(AccountEntityMapper.class);

    AccountEntity toEntity(Account account);
    Account toDomain(AccountEntity accountEntity);

}
