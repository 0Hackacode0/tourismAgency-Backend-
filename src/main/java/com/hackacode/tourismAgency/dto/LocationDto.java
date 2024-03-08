package com.hackacode.tourismAgency.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class LocationDto {

    private Long idLocation;
    @NonNull
    private String country;
    @NonNull
    private String state;
    @NonNull
    private String city;
}