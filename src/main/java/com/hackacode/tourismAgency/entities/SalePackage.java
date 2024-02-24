package com.hackacode.tourismAgency.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Setter
@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class SalePackage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTouristPackage;
    private double totalAmount;
    @ManyToMany(mappedBy = "packages")
    private List<TravelInventoryItem> travelItems;
}
