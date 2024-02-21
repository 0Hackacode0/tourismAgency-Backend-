package com.hackacode.tourismAgency.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name="sale_package")
@NoArgsConstructor
@AllArgsConstructor
public class SalePackageEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTouristpackage;
    private Integer packageCode;
    private Double packageCost;
}
