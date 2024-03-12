package com.hackacode.tourismAgency.controller;

import com.hackacode.tourismAgency.dto.ClientDto;
import com.hackacode.tourismAgency.entities.Client;
import com.hackacode.tourismAgency.entities.Employee;
import com.hackacode.tourismAgency.services.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/clients")
public class ClientController {
    
    private final ClientService clientService;
    
    @PostMapping
    public ResponseEntity<ClientDto> save(@RequestBody ClientDto dto) {
        Client client = clientDtoToEntity(dto);
        clientService.save(client);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }

    private Client clientDtoToEntity(ClientDto dto) {
        Client client = new Client();
        client.setIdClient(dto.getIdClient());
        client.setName(dto.getNameClient());
        client.setLastName(dto.getLastNameClient());
        client.setAddress(dto.getAddressClient());
        client.setDni(dto.getDniClient());
        client.setNationality(dto.getNationalityClient());
        client.setCellPhone(dto.getCellPhoneClient());
        client.setDateOfBirth(dto.getDateOfBirthClient());
        client.setEmail(dto.getEmailClient());


        Employee employee = new Employee();
        employee.setIdEmployee(dto.getEmployee().getIdEmployee());
        client.setEmployee(employee);

        return client;
    }
}
