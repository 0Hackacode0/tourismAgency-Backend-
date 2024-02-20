package com.hackacode.tourismAgency.repositories;

import com.hackacode.tourismAgency.entities.TravelInventoryItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TravelInventoryItemRepository extends JpaRepository<TravelInventoryItemEntity, Long> {
}
