package com.javademo.mapper;

import com.javademo.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author maple
 * @name 金色木叶枫
 * @since Created time on 2017/7/30 下午6:42.
 */
@Mapper
public interface UserMapper {

    @Select(value="select *from user where id=#{id}")
    User findOne(int id);
}
