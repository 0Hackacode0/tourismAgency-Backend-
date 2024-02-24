package com.hackacode.tourismAgency.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.util.Date;
import java.util.List;
import java.util.Objects;

@Setter
@Getter
@ToString
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

    @OneToOne
    @JoinColumn(name = "id_location_orgn")
    private Location origin;

    @OneToOne
    @JoinColumn(name = "id_location_dest")
    private Location destination;

    @ManyToMany
    @JoinTable(name ="travel_sale_package",
            joinColumns = @JoinColumn(name = "id_travel"),
            inverseJoinColumns = @JoinColumn(name = "id_tourist_package")
    )
    @ToString.Exclude
    private List<SalePackage> packages;

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        TravelInventoryItem that = (TravelInventoryItem) o;
        return getIdTravel() != null && Objects.equals(getIdTravel(), that.getIdTravel());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }
}
