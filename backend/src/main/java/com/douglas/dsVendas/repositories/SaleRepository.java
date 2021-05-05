package com.douglas.dsVendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.douglas.dsVendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
