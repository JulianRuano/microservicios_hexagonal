package co.unicauca.edu.infraestructure.adapters.input.rest.mapper;

import co.unicauca.edu.domain.model.Account;
import co.unicauca.edu.infraestructure.adapters.input.rest.data.AddAccountRequest;
import co.unicauca.edu.infraestructure.adapters.input.rest.data.AddAccountResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RestMapper {
    RestMapper INSTANCE = Mappers.getMapper(RestMapper.class);
    @Mapping(target = ".", source = ".")

    Account toDomain(AddAccountRequest addAccountRequest);
    @Mapping(target = ".", source = ".")
    AddAccountResponse toResponse(Account account);
}
