package com.hackacode.tourismAgency.entities;


import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLocation;
    private String country;
    private String state;
    private String city;
    @ManyToOne
    @JoinColumn(name = "id_locat_orgns", foreignKey = @ForeignKey(name = "FK_LOCATION_ORIGINS"))
    private TravelInventoryItem travelInventoriesOrigins;
    @ManyToOne
    @JoinColumn(name = "id_locat_dest", foreignKey = @ForeignKey(name = "FK_LOCATION_DEST"))
    private TravelInventoryItem travelInventoriesDestinations;
}
