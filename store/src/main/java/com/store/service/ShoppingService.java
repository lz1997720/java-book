package com.store.service;

import com.store.dto.ShoppingDTO;
import com.store.model.Shopping;

import java.util.List;

public interface ShoppingService {
	public void buyGoods(int goodsId,String userName);
	
	public List<ShoppingDTO> selectShopping(int userId);

	public int getNum(int userId);

	public double total(int userId);

	public void delShopping(int id);

}
