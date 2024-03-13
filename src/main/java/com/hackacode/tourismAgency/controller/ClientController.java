package com.hackacode.tourismAgency.controller;

import com.hackacode.tourismAgency.dto.ClientDto;
import com.hackacode.tourismAgency.entities.Client;

import com.hackacode.tourismAgency.services.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.hackacode.tourismAgency.mapper.ClientMapper.clientDtoToEntity;


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


}
