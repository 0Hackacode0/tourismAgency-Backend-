package com.hackacode.tourismAgency.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="location")
public class LocationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_location;
    private String country;
    private String state;
    private String city;
    private Long travel_inventory_item_id_touristservice;
}
