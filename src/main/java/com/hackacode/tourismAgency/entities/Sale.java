package com.hackacode.tourismAgency.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.util.Date;
import java.util.Objects;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSale;
    private int saleNumber;
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

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        Sale sale = (Sale) o;
        return getIdSale() != null && Objects.equals(getIdSale(), sale.getIdSale());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }
}
