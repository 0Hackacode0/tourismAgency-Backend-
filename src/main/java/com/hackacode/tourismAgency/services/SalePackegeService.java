package com.hackacode.tourismAgency.services;

import com.hackacode.tourismAgency.entities.SalePackage;

import java.util.List;

public interface SalePackegeService {
    SalePackage save(SalePackage salePackage);
    List<SalePackage> readAll();
    SalePackage readById(Long id);
    SalePackage update(SalePackage salePackage);
    void delete(Long id);
}
