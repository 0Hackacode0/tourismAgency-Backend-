package com.hackacode.tourismAgency.services.impl;

import com.hackacode.tourismAgency.entities.Sale;
import com.hackacode.tourismAgency.repositories.SaleRepository;
import com.hackacode.tourismAgency.services.SaleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class SaleServiceImpl implements SaleService {

    private final SaleRepository saleRepo;
    @Override
    public Sale save(Sale sale) {
        return saleRepo.save(sale);
    }

    @Override
    public List<Sale> readAll() {
        return saleRepo.findAll();
    }

    @Override
    public Sale readById(Long id) {
        return saleRepo.findById(id).orElse(null);
    }

    @Override
    public Sale update(Sale sale) {
        return saleRepo.save(sale);
    }

    @Override
    public void delete(Long id) {
        saleRepo.deleteById(id);
    }
}
