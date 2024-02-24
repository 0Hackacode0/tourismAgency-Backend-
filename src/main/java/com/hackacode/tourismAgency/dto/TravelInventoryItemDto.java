package com.hackacode.tourismAgency.dto;

import com.hackacode.tourismAgency.entities.AvailavilityEnum;
import com.hackacode.tourismAgency.entities.ServiceTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TravelInventoryItemDto {

    private Long idTravel;
    private ServiceTypeEnum serviceCode;
    private String itemName;
    private String shortDescription;
    private double costService;
    private int totalAmount;
    private int remainingAmount;
    private Date dateService;
    private AvailavilityEnum status;
    private LocationDto origin;
    private LocationDto destination;
    private List<SalePackageDto> packages;

}