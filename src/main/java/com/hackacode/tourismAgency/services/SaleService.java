package com.hackacode.tourismAgency.services;

import com.hackacode.tourismAgency.entities.Sale;

import java.util.List;

public interface SaleService {
    Sale save(Sale sale);
    List<Sale> readAll();
    Sale readById(Long id);
    Sale update(Sale sale);
    void delete(Long id);
}
