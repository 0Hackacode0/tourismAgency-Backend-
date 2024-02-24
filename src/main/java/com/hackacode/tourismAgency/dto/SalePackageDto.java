package com.hackacode.tourismAgency.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SalePackageDto {

    private Long idTouristPackage;
    private double totalAmount;
    private List<TravelInventoryItemDto> travelItems;
}