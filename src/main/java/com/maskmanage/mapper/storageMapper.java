package com.maskmanage.mapper;

import com.maskmanage.entity.storage;
import com.maskmanage.entity.storageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface storageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table storage
     *
     * @mbggenerated Sat May 30 09:44:25 CST 2020
     */
    int countByExample(storageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table storage
     *
     * @mbggenerated Sat May 30 09:44:25 CST 2020
     */
    int deleteByExample(storageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table storage
     *
     * @mbggenerated Sat May 30 09:44:25 CST 2020
     */
    int deleteByPrimaryKey(Integer storageid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table storage
     *
     * @mbggenerated Sat May 30 09:44:25 CST 2020
     */
    int insert(storage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table storage
     *
     * @mbggenerated Sat May 30 09:44:25 CST 2020
     */
    int insertSelective(storage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table storage
     *
     * @mbggenerated Sat May 30 09:44:25 CST 2020
     */
    List<storage> selectByExample(storageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table storage
     *
     * @mbggenerated Sat May 30 09:44:25 CST 2020
     */
    storage selectByPrimaryKey(Integer storageid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table storage
     *
     * @mbggenerated Sat May 30 09:44:25 CST 2020
     */
    int updateByExampleSelective(@Param("record") storage record, @Param("example") storageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table storage
     *
     * @mbggenerated Sat May 30 09:44:25 CST 2020
     */
    int updateByExample(@Param("record") storage record, @Param("example") storageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table storage
     *
     * @mbggenerated Sat May 30 09:44:25 CST 2020
     */
    int updateByPrimaryKeySelective(storage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table storage
     *
     * @mbggenerated Sat May 30 09:44:25 CST 2020
     */
    int updateByPrimaryKey(storage record);
}