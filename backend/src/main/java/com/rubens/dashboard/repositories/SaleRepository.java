package com.rubens.dashboard.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rubens.dashboard.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}

