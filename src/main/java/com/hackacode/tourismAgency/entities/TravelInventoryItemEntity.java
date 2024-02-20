package com.hackacode.tourismAgency.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Setter
@Getter
@Table(name="travel_inventory_item")
@NoArgsConstructor
@AllArgsConstructor
public class TravelInventoryItemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idtouristservice;
    private Integer code_service;
    private String name;
    private String description;
    private String destination;
    private Double cost_service;
    private Date date_service;
}
