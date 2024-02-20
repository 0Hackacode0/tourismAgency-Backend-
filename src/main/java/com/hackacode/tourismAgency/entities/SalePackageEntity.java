package com.hackacode.tourismAgency.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name="sale_package")
public class SalePackageEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_touristpackage;
    private Integer package_code;
    private Double package_cost;
}
