package com.ss.dao;

import com.ss.po.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @ClassName:
 * @desc:
 * @author: jintao
 * @date: 2018-05-11 下午3:58
 **/
@Mapper
public interface UserDao {
    @Select("SELECT * FROM user WHERE id = #{id}")
    User findOne(@Param("id") Integer id);
}
