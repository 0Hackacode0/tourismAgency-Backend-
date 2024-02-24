package com.hackacode.tourismAgency.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Setter
@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class TravelInventoryItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTravel;
    private ServiceTypeEnum serviceCode;
    private String itemName;
    private String shortDescription;
    private double costService;
    private int totalAmount;
    private int remainingAmount;
    private Date dateService;
    private AvailavilityEnum status;
    @OneToMany(mappedBy = "travelInventoriesOrigins")
    private List<Location> origin;
    @OneToMany(mappedBy = "travelInventoriesDestinations")
    private List<Location> destination;
    @ManyToMany
    @JoinTable(name ="travel_sale_package",
            joinColumns = @JoinColumn(name = "id_travel"),
            inverseJoinColumns = @JoinColumn(name = "id_tourist_package")
    )
    private List<SalePackage> packages;
}
