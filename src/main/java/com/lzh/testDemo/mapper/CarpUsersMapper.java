package com.lzh.testDemo.mapper;

import com.lzh.testDemo.domain.CarpUsers;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CarpUsersMapper {

    /**
     * 根据number获取一条同学信息
     *
     * @param number 同学工号
     * @return CarpUsers
     */
    CarpUsers selectUserByNumber(@Param("number") String number);

    /**
     * 插入一条同学信息
     *
     * @param carpUsers CarpUsers
     * @return 0 插入失败,1 插入成功
     */
    Integer insertUser(CarpUsers carpUsers);

    /**
     * 根据工号更新一条同学信息
     *
     * @param carpUsers CarpUsers
     * @return 0 插入失败,1 插入成功
     */
    Integer updateUser(CarpUsers carpUsers);
}
