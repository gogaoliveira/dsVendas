package com.douglas.dsVendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.douglas.dsVendas.dto.SaleSuccessDTO;
import com.douglas.dsVendas.dto.SaleSumDTO;
import com.douglas.dsVendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{
	
	@Query("SELECT new com.douglas.dsVendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) "
			+ " FROM Sale as obj GROUP BY obj.seller ")
	List<SaleSumDTO>  amountGroupedBySeller();
	
	@Query("SELECT new com.douglas.dsVendas.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) "
			+ " FROM Sale as obj GROUP BY obj.seller ")
	List<SaleSuccessDTO>  successGroupedBySeller();
	
	
	

}
