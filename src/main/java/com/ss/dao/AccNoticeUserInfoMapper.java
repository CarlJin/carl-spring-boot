package com.ss.dao;

import com.ss.po.AccNoticeUserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @ClassName:
 * @desc:
 * @author: jintao
 * @date: 2018-05-08 下午6:28
 **/
@Mapper
public interface AccNoticeUserInfoMapper {
    @Select("SELECT * FROM acc_notice_user_info WHERE user_name = #{userName}")
    AccNoticeUserInfo findOne(@Param("userName") String userName);

}
