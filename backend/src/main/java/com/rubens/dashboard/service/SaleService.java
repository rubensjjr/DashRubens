package com.rubens.dashboard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rubens.dashboard.dto.SaleDTO;
import com.rubens.dashboard.dto.SaleSucessDTO;
import com.rubens.dashboard.dto.SaleSumDTO;
import com.rubens.dashboard.entities.Sale;
import com.rubens.dashboard.repositories.SaleRepository;
import com.rubens.dashboard.repositories.SellerRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page <SaleDTO> findAll(Pageable pagable) {
		sellerRepository.findAll();
		Page<Sale> result =repository.findAll(pagable);
		return 	 result.map(x -> new SaleDTO(x));

	}
	
	@Transactional(readOnly = true)
	public List <SaleSumDTO> amountGroupBySeller(){
		return repository.amountGroupBySeller();
	}
	
	@Transactional(readOnly = true)
	public List <SaleSucessDTO> sucessGroupBySeller(){
		return repository.sucessGroupBySeller();
	}

}

