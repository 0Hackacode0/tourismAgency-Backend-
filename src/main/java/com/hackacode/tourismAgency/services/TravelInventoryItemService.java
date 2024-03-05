package com.hackacode.tourismAgency.services;

import com.hackacode.tourismAgency.entities.TravelInventoryItem;

import java.util.List;

public interface TravelInventoryItemService {
    TravelInventoryItem save(TravelInventoryItem travelInventoryItem);
    List<TravelInventoryItem> readAll();
    TravelInventoryItem readById(Long id);
    TravelInventoryItem update(TravelInventoryItem travelInventoryItem);
    void delete(Long id);
}
