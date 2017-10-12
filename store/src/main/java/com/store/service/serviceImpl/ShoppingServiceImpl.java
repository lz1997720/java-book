package com.store.service.serviceImpl;

import com.store.dto.ShoppingDTO;
import com.store.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store.mapper.ShoppingMapper;
import com.store.model.Shopping;
import com.store.service.ShoppingService;

import java.util.List;

@Service
public class ShoppingServiceImpl implements ShoppingService{
	@Autowired
	private ShoppingMapper shoppingMapper;
	@Autowired
	private UserMapper userMapper;
	
	public void buyGoods(int goodsId, String userName  ) {
		shoppingMapper.shopping(goodsId, userMapper.selectUserId(userName));
	}

	public List<ShoppingDTO> selectShopping(int userId) {

		return shoppingMapper.selectShopping(userId);
	}

	public int getNum(int userId) {
		String num = String.valueOf(shoppingMapper.getNum(userId));
		if(num!=null){
			return shoppingMapper.getNum(userId);
		}else{
			return 0;
		}
	}

	public double total(int userId) {
		String total = String.valueOf(shoppingMapper.total(userId));
		if(total!=null){
			return shoppingMapper.total(userId);
		}else{
			return 0;
		}
	}

	public void delShopping(int id) {
		shoppingMapper.delShopping(id);
		
	}

}
