package com.store.happyHeels.service;

import java.util.List;

import com.store.happyHeels.model.PurchaseItem;
import com.store.happyHeels.model.PurchaseOrder;
import com.store.happyHeels.model.User;

public interface PurchaseItemService {

	public PurchaseItem getPurchaseItemById(Long id);

	public List<PurchaseItem> getAllItemsByPurchaseOrder(PurchaseOrder order);

	public List<PurchaseItem> getAllPurchaseItemByUserId(User userId);

	public PurchaseItem savePurchaseItem(PurchaseItem purchaseItem);

	public List<PurchaseItem> getAllPurchaseItemList();

}
