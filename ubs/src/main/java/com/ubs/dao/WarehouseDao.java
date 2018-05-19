package com.ubs.dao;


import com.ubs.model.Warehouse;

public interface WarehouseDao {

	public void addWarehouse(Warehouse wh);

	public void updateWarehouse(Warehouse wh);

	public void deleteWarehouse(Warehouse wh);
	
	public void getInfoAboutWareHouse(String name);
}
