package com.store.happyHeels.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.store.happyHeels.model.PurchaseOrder;

public interface PurchaseOrderRepository extends JpaRepository<PurchaseOrder, Long> {
	
	

}
