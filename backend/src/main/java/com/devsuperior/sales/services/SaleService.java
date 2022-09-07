package com.devsuperior.sales.services;

import com.devsuperior.sales.entities.Sale;
import com.devsuperior.sales.repositories.SaleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {
    private final SaleRepository saleRepository;

    public SaleService(SaleRepository saleRepository) {
        this.saleRepository = saleRepository;
    }

    public List<Sale> findSales() {
        return saleRepository.findAll();
    }
}
