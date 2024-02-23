package com.hackacode.tourismAgency.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Setter
@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSale;
    private Long saleNumber;
    private Date saleDate;
    private SaleStatusEnum status;
    private PaymentMethodTypeEnum paymentMethod;

    @OneToOne
    @JoinColumn(name = "id_tourist_package")
    private SalePackage salePackage;

    @ManyToOne
    @JoinColumn(name = "id_employee")
    private Employee employee;

    @OneToOne
    @JoinColumn(name = "id_client")
    private Client client;


}
