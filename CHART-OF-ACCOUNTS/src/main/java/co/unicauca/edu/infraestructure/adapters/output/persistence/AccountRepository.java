package co.unicauca.edu.infraestructure.adapters.output.persistence;

import co.unicauca.edu.infraestructure.adapters.output.persistence.entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRepository extends JpaRepository<AccountEntity, Long>{
    List<AccountEntity> findAllByTenantId(Long tenantId);//Todas las consultas deben ser por tenantId
}
