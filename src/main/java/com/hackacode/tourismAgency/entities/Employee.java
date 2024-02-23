package com.hackacode.tourismAgency.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee extends Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_employee")
    private Long idEmployee;

    @Column(nullable = false)
    private String role;

    @Column(columnDefinition = "decimal(6,2)")
    private double salary;

    @OneToMany(mappedBy = "employee")
    private List<Sale> sales;
}
