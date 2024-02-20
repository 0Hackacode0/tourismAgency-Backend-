package com.hackacode.tourismAgency.repositories;

import com.hackacode.tourismAgency.entities.SalePackageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalePackageRepository extends JpaRepository<SalePackageEntity, Long> {
}
