package com.javademo.mapper;

import com.javademo.domain.User;
import javafx.scene.chart.ValueAxis;
import org.apache.ibatis.annotations.*;

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

    //进行参数绑定
    @Results({
            @Result(property = "name", column = "name"),  //@Result中的property属性对应User对象中的成员名
            @Result(property = "age", column = "age")    //column对应数据库中的字段名
    })
    @Select(value = "select * from user")
    List<User> selectList();

    @Insert(value = "INSERT INTO USER(NAME, AGE) VALUES(#{name}, #{age})")
    //int addUser(@Param("name") String name, @Param("age") Integer age);
    int addUser(User user);

    @Update(value = "UPDATE USER SET age=#{age} where id=#{id}")
    int updateUser(User user);


}
