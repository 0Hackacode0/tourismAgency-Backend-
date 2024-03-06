package com.hackacode.tourismAgency.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SalePackageDto {

    private Long idTouristPackage;
    @NonNull
    private double totalAmount;
    @NonNull
    private List<TravelInventoryItemDto> travelItems;
}