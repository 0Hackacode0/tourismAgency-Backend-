package com.hackacode.tourismAgency.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class LocationDto {

    private Long idLocation;
    private String country;
    private String state;
    private String city;
}