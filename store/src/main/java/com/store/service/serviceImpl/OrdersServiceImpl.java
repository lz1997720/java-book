package com.store.service.serviceImpl;

import com.store.dto.OrdersDTO;
import com.store.mapper.*;
import com.store.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersServiceImpl implements OrdersService {
    @Autowired
    OrdersMapper ordersMapper;
    @Autowired
    GoodsMapper goodsMapper;
    @Autowired
    ShoppingMapper shoppingMapper;
    @Autowired
    CategoryMapper categoryMapper;
    @Autowired
    UserMapper userMapper;

    public void order(String goodsName, String userName,double price) {
        int goodsId = categoryMapper.selectCategoryIdByGoodsName(goodsName);
        int userId = userMapper.selectUserId(userName);
        int exist = ordersMapper.exist(goodsId);
        int userOrderId = ordersMapper.selUserOrderId(userId);
        if(exist !=0){
            ordersMapper.addNum(userOrderId,goodsId);
            ordersMapper.addPrice(userOrderId,goodsId);
        }else{
            ordersMapper.order(goodsId,price,userOrderId,userId);
        }
        shoppingMapper.delShopping(goodsId);
    }

    public List<OrdersDTO> selectOrder(String userName) {
        int userId = userMapper.selectUserId(userName);
        return ordersMapper.selectOrder(userId);
    }

    public void delOrder(int id) {
       ordersMapper.delOrder(id);
    }

    public int getNum(String userName) {
        int userId = userMapper.selectUserId(userName);
        int num = ordersMapper.getNum(userId);
        if(num ==0){
            return 0;
        }else{
            return num;
        }

    }

    public double total(String userName) {
        int userId = userMapper.selectUserId(userName);
        return ordersMapper.total(userId);
    }

    public void finish(String userName) {
        int userId = userMapper.selectUserId(userName);
        List<OrdersDTO> l = ordersMapper.selectOrder(userId);
        for(int i = 0;i<l.size();i++){
            goodsMapper.updateGoods(categoryMapper.selectCategoryIdByGoodsName(l.get(i).getName()));
        }
        ordersMapper.finish(userId);
    }
}
