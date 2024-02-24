package com.hackacode.tourismAgency.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.util.List;
import java.util.Objects;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class SalePackage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTouristPackage;
    private double totalAmount;

    @ManyToMany(mappedBy = "packages")
    @ToString.Exclude
    private List<TravelInventoryItem> travelItems;

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        SalePackage that = (SalePackage) o;
        return getIdTouristPackage() != null && Objects.equals(getIdTouristPackage(), that.getIdTouristPackage());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }
}
