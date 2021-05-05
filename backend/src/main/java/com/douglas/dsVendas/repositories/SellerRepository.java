package com.douglas.dsVendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.douglas.dsVendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long>{

}
