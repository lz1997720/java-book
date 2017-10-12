package com.store.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.store.model.User;

@Repository
public interface UserMapper {
	
	@Select("select * from user where userName = #{name} and password = #{password}")
	public User selectUser(@Param("name") String name, @Param("password") String password);
	
	@Insert("insert into user (userName,sex,password) values (#{name},#{sex},#{password})")
	public void createUser(@Param("name") String name, @Param("sex") String sex,@Param("password") String password);

	@Insert("insert into orders (userId) values (#{userId})")
	public void createUserOrderId(@Param("userId") int userId);

	@Select("select id from user where userName = #{name}")
	public int  selectUserId(@Param("name") String name);
}
