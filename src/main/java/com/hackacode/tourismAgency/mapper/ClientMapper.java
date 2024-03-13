package com.hackacode.tourismAgency.mapper;

import com.hackacode.tourismAgency.dto.ClientDto;
import com.hackacode.tourismAgency.entities.Client;
import com.hackacode.tourismAgency.entities.Employee;
import org.springframework.stereotype.Component;

@Component
public class ClientMapper {

    public static Client clientDtoToEntity(ClientDto dto) {
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
