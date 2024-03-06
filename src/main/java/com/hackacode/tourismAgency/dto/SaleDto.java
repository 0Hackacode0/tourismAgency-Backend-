package com.hackacode.tourismAgency.dto;

import com.hackacode.tourismAgency.entities.Client;
import com.hackacode.tourismAgency.entities.Employee;
import com.hackacode.tourismAgency.entities.PaymentMethodTypeEnum;
import com.hackacode.tourismAgency.entities.SaleStatusEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SaleDto {

    private Long idSale;
    @NonNull
    private int saleNumber;
    @NonNull
    private Date saleDate;
    private SaleStatusEnum status;
    @NonNull
    private PaymentMethodTypeEnum paymentMethod;
    @NonNull
    private SalePackageDto salePackage;
    @NonNull
    private Employee employee;
    @NonNull
    private Client client;
}