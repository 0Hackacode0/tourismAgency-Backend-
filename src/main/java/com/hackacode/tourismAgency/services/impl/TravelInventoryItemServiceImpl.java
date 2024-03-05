package com.hackacode.tourismAgency.services.impl;

import com.hackacode.tourismAgency.entities.TravelInventoryItem;
import com.hackacode.tourismAgency.repositories.TravelInventoryItemRepository;
import com.hackacode.tourismAgency.services.TravelInventoryItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class TravelInventoryItemServiceImpl implements TravelInventoryItemService {

    private final TravelInventoryItemRepository travelInventoryItemRepo;

    @Override
    public TravelInventoryItem save(TravelInventoryItem travelInventoryItem) {
        return travelInventoryItemRepo.save(travelInventoryItem);
    }

    @Override
    public List<TravelInventoryItem> readAll() {
        return travelInventoryItemRepo.findAll();
    }

    @Override
    public TravelInventoryItem readById(Long id) {
        return travelInventoryItemRepo.findById(id).orElse(null);
    }

    @Override
    public TravelInventoryItem update(TravelInventoryItem travelInventoryItem) {
        return travelInventoryItemRepo.save(travelInventoryItem);
    }

    @Override
    public void delete(Long id) {
        travelInventoryItemRepo.deleteById(id);
    }
}
