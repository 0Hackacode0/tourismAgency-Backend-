package com.hackacode.tourismAgency.dto;

import com.hackacode.tourismAgency.entities.Client;
import com.hackacode.tourismAgency.entities.Employee;
import com.hackacode.tourismAgency.entities.PaymentMethodTypeEnum;
import com.hackacode.tourismAgency.entities.SaleStatusEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SaleDto {

    private Long idSale;
    private int saleNumber;
    private Date saleDate;
    private SaleStatusEnum status;
    private PaymentMethodTypeEnum paymentMethod;
    private SalePackageDto salePackage;
    private Employee employee;
    private Client client;
}