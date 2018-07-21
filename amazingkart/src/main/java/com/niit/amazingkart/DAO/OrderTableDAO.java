package com.niit.amazingkart.DAO;

import java.util.List;

import com.niit.amazingkart.model.OrderTable;

public interface OrderTableDAO {
	
	public boolean save(OrderTable orderTable);
	public List<OrderTable> list(String userId);

}
