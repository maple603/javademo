package com.javademo.mapper;

import com.javademo.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author maple
 * @name 金色木叶枫
 * @since Created time on 2017/7/30 下午6:42.
 */
@Mapper
public interface UserMapper {

    @Select(value="select *from user where id=#{id}")
    User findOne(int id);

    @Select(value = "select * from user")
    List<User> selectList();

    @Insert(value = "INSERT INTO USER(NAME, AGE) VALUES(#{name}, #{age})")
    //int addUser(@Param("name") String name, @Param("age") Integer age);
    int addUser(User user);
}
