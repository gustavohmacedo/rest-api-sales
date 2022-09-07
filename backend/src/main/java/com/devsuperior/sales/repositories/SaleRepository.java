package com.devsuperior.sales.repositories;

import com.devsuperior.sales.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> {
}
