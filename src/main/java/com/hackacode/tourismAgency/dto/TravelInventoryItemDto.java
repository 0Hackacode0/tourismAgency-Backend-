package com.hackacode.tourismAgency.dto;

import com.hackacode.tourismAgency.entities.AvailavilityEnum;
import com.hackacode.tourismAgency.entities.ServiceTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TravelInventoryItemDto {

    private Long idTravel;
    @NonNull
    private ServiceTypeEnum serviceCode;
    @NonNull
    private String itemName;
    private String shortDescription;
    @NonNull
    private double costService;
    @NonNull
    private int totalAmount;
    @NonNull
    private int remainingAmount;
    @NonNull
    private Date dateService;
    @NonNull
    private AvailavilityEnum status;
    @NonNull
    private LocationDto origin;
    @NonNull
    private LocationDto destination;
    @NonNull
    private List<SalePackageDto> packages;

}