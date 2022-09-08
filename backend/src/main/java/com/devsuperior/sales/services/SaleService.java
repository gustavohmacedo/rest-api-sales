package com.devsuperior.sales.services;

import com.devsuperior.sales.entities.Sale;
import com.devsuperior.sales.repositories.SaleRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

@Service
public class SaleService {
    private final SaleRepository saleRepository;

    public SaleService(SaleRepository saleRepository) {
        this.saleRepository = saleRepository;
    }

    public Page<Sale> findSales(String minDate, String maxDate, Pageable pagination) {
        LocalDate today = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());
        LocalDate minimumDate = minDate.equals("") ? today.minusDays(365) : LocalDate.parse(minDate);
        LocalDate maximumDate = maxDate.equals("") ? today : LocalDate.parse(maxDate);
        return saleRepository.findSalesByDates(minimumDate, maximumDate, pagination);
    }

}

