package com.hackacode.tourismAgency.services.impl;

import com.hackacode.tourismAgency.entities.SalePackage;
import com.hackacode.tourismAgency.repositories.SalePackageRepository;
import com.hackacode.tourismAgency.services.SalePackegeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class SalePackageServiceImpl implements SalePackegeService {

    private final SalePackageRepository salePackageRepo;
    @Override
    public SalePackage save(SalePackage salePackage) {
        return salePackageRepo.save(salePackage);
    }

    @Override
    public List<SalePackage> readAll() {
        return salePackageRepo.findAll();
    }

    @Override
    public SalePackage readById(Long id) {
        return salePackageRepo.findById(id).orElse(null);
    }

    @Override
    public SalePackage update(SalePackage salePackage) {
        return salePackageRepo.save(salePackage);
    }

    @Override
    public void delete(Long id) {
        salePackageRepo.deleteById(id);
    }
}
