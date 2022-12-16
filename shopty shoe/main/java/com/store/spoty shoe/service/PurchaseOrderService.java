package com.store.happyHeels.service;

import java.util.List;

import com.store.happyHeels.model.PurchaseOrder;

public interface PurchaseOrderService {
	

public PurchaseOrder getPurchaseById(long id);
	
	public List<PurchaseOrder> getAllPurchaseOrders();
	
	public List<PurchaseOrder> getAllPurchaseOrderByUserId(Long userId);
	
	public PurchaseOrder savePurchaseOrder(PurchaseOrder purchaseOrder);
}
