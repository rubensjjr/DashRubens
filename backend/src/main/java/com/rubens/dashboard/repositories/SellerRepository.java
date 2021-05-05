package com.rubens.dashboard.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rubens.dashboard.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
