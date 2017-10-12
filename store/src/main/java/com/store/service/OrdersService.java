package com.store.service;


import com.store.dto.OrdersDTO;

import java.util.List;

public interface OrdersService {
    public void order(String goodsName,String userName,double price);//加入订单

    public List<OrdersDTO>selectOrder(String userName);

    public void delOrder(int id);

    public int getNum(String userName);

    public double total(String userName);

    public void finish(String userName);
}
