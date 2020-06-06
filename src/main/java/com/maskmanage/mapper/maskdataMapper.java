package com.maskmanage.mapper;

import com.maskmanage.entity.maskdata;
import com.maskmanage.entity.maskdataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface maskdataMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table maskdata
     *
     * @mbggenerated Sat May 30 19:20:01 CST 2020
     */
    int countByExample(maskdataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table maskdata
     *
     * @mbggenerated Sat May 30 19:20:01 CST 2020
     */
    int deleteByExample(maskdataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table maskdata
     *
     * @mbggenerated Sat May 30 19:20:01 CST 2020
     */
    int deleteByPrimaryKey(Integer dataid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table maskdata
     *
     * @mbggenerated Sat May 30 19:20:01 CST 2020
     */
    int insert(maskdata record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table maskdata
     *
     * @mbggenerated Sat May 30 19:20:01 CST 2020
     */
    int insertSelective(maskdata record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table maskdata
     *
     * @mbggenerated Sat May 30 19:20:01 CST 2020
     */
    List<maskdata> selectByExample(maskdataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table maskdata
     *
     * @mbggenerated Sat May 30 19:20:01 CST 2020
     */
    maskdata selectByPrimaryKey(Integer dataid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table maskdata
     *
     * @mbggenerated Sat May 30 19:20:01 CST 2020
     */
    int updateByExampleSelective(@Param("record") maskdata record, @Param("example") maskdataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table maskdata
     *
     * @mbggenerated Sat May 30 19:20:01 CST 2020
     */
    int updateByExample(@Param("record") maskdata record, @Param("example") maskdataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table maskdata
     *
     * @mbggenerated Sat May 30 19:20:01 CST 2020
     */
    int updateByPrimaryKeySelective(maskdata record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table maskdata
     *
     * @mbggenerated Sat May 30 19:20:01 CST 2020
     */
    int updateByPrimaryKey(maskdata record);
}