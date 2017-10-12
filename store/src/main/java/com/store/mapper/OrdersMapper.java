package com.store.mapper;
import com.store.dto.OrdersDTO;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdersMapper {
    @Insert("insert into orders_goods (goodsId,num,price,orderId,userId) values (#{goodsId},1,#{price},#{orderId},#{userId})")
    public void order(@Param("goodsId")int goodsId, @Param("price")double price,@Param("orderId")int orderId,@Param("userId")int userId );

    @Select("select id from orders where userId = #{userId}")
    public int selUserOrderId(@Param("userId")int id);

    @Select("select ifnull(MAX(goodsId),0)AS goodsId from orders_goods where goodsId = #{goodsId}")
    public int exist(@Param("goodsId")int goodsId);

    @Update("update orders_goods set num = num +1 where orderId = #{orderId} and goodsId = #{goodsId}")
    public void addNum(@Param("orderId")int orderId,@Param("goodsId")int goodsId);

    @Update("update orders_goods set price = price*2 where orderId = #{orderId} and goodsId = #{goodsId}")
    public void addPrice(@Param("orderId")int orderId,@Param("goodsId")int goodsId);

    @Select("select og.id,god.name,og.num,og.price,us.userName from goods god,user us,orders ord,orders_goods og where god.id = og.goodsId and us.id = ord.userId and ord.userId= #{userId}")
    public List <OrdersDTO> selectOrder(@Param("userId")int userId );

    @Delete("delete from orders_goods where id = #{id}")
    public void delOrder(@Param("id")int id);

    @Select("select ifnull(count(*),0) as value from goods god,user us,orders ord,orders_goods og where god.id = og.goodsId and us.id = ord.userId = #{userId};")
    public int getNum(@Param("userId") int userId);

    @Select("select ifnull(sum(og.price),0)as total from goods god,user us,orders ord,orders_goods og where god.id = og.goodsId and us.id = ord.userId = #{userId}")
    public double total(@Param("userId") int userId);

    @Delete("delete from orders_goods where userId = #{userId};")
    public void finish(@Param("userId") int userId);
}
