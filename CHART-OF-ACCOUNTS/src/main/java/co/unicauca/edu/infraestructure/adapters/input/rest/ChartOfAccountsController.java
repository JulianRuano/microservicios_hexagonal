package co.unicauca.edu.infraestructure.adapters.input.rest;


import co.unicauca.edu.application.ports.input.AddAccountUseCase;
import co.unicauca.edu.application.ports.input.ListAccountsUseCase;
import co.unicauca.edu.domain.model.Account;
import co.unicauca.edu.infraestructure.adapters.input.rest.data.AddAccountRequest;
import co.unicauca.edu.infraestructure.adapters.input.rest.data.AddAccountResponse;
import co.unicauca.edu.infraestructure.adapters.input.rest.mapper.RestMapper;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/chart-of-accounts")
@RestController
public class ChartOfAccountsController {
    private final AddAccountUseCase addAccountUseCase;
    private final ListAccountsUseCase listAccountsUseCase;

    @Autowired
    public ChartOfAccountsController(AddAccountUseCase addAccountUseCase, ListAccountsUseCase listAccountsUseCase) {
        this.addAccountUseCase = addAccountUseCase;
        this.listAccountsUseCase = listAccountsUseCase;
    }


    @ApiOperation(value = "Add a new account")
    @PostMapping(value = "/add-account")
    public ResponseEntity<?> addAccount(@RequestBody AddAccountRequest request) {
        Account account = RestMapper.INSTANCE.toDomain(request);
        account = addAccountUseCase.addAccount(account);

        AddAccountResponse response = RestMapper.INSTANCE.toResponse(account);
        return ResponseEntity.ok(response);
    }
}
