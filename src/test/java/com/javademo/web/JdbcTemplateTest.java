package com.javademo.web;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author maple
 * @name 金色木叶枫
 * @since Created time on 2017/7/30 下午7:39.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class JdbcTemplateTest {

    //主库
    @Autowired
    @Qualifier("masterJdbcTemplate")
    protected JdbcTemplate jdbcTemplate1;

    //副库
    @Autowired
    @Qualifier("slaveJdbcTemplate")
    protected JdbcTemplate jdbcTemplate2;

    @Test
    public void test() throws Exception {
        // 往第一个数据源中插入两条数据
        jdbcTemplate1.update("insert into user(id,name,age) values(?, ?, ?)", 1, "hello", 20);
        // 往第二个数据源中插入一条数据，若插入的是第一个数据源，则会主键冲突报错
        jdbcTemplate2.update("insert into user(id,name,age) values(?, ?, ?)", 1, "sushou", 20);
        // 查一下第一个数据源中是否有两条数据，验证插入是否成功
        Assert.assertEquals("2", jdbcTemplate1.queryForObject("select count(1) from user", String.class));
        // 查一下第一个数据源中是否有两条数据，验证插入是否成功
        Assert.assertEquals("1", jdbcTemplate2.queryForObject("select count(1) from user", String.class));
    }
}
