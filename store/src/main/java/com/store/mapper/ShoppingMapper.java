package com.store.mapper;

import com.store.dto.ShoppingDTO;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.store.model.Shopping;
import com.store.model.User;

import java.util.List;

@Repository
public interface ShoppingMapper {
	@Insert("insert into shopping (goodsId,userId) values (#{goodsId},#{userId})")
	public void shopping(@Param("goodsId")int goodsId,@Param("userId")int userId );
	
	@Select("select sho.id,god.name,god.price,us.userName from goods god,user us,shopping sho where god.id = sho.goodsId and us.id=sho.userId and sho.userId = #{userId};")
	public List<ShoppingDTO> selectShopping(@Param("userId") int userId);

	@Select("select ifnull(count(*),0) as value from goods god,user us,shopping sho where god.id = sho.goodsId and sho.userId = #{userId};")
	public int getNum(@Param("userId") int userId);

	@Select("select ifnull(sum(price),0)as total from goods god,user us,shopping sho where god.id = sho.goodsId and sho.userId = #{userId};")
	public double total(@Param("userId") int userId);

	@Delete("delete from shopping where id = #{id}")
	public void delShopping(@Param("id") int id);
}
