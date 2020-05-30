package com.maskmanage.mapper;

import com.maskmanage.entity.data;
import com.maskmanage.entity.dataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface dataMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data
     *
     * @mbggenerated Sat May 30 09:44:25 CST 2020
     */
    int countByExample(dataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data
     *
     * @mbggenerated Sat May 30 09:44:25 CST 2020
     */
    int deleteByExample(dataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data
     *
     * @mbggenerated Sat May 30 09:44:25 CST 2020
     */
    int deleteByPrimaryKey(Integer dataid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data
     *
     * @mbggenerated Sat May 30 09:44:25 CST 2020
     */
    int insert(data record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data
     *
     * @mbggenerated Sat May 30 09:44:25 CST 2020
     */
    int insertSelective(data record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data
     *
     * @mbggenerated Sat May 30 09:44:25 CST 2020
     */
    List<data> selectByExample(dataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data
     *
     * @mbggenerated Sat May 30 09:44:25 CST 2020
     */
    data selectByPrimaryKey(Integer dataid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data
     *
     * @mbggenerated Sat May 30 09:44:25 CST 2020
     */
    int updateByExampleSelective(@Param("record") data record, @Param("example") dataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data
     *
     * @mbggenerated Sat May 30 09:44:25 CST 2020
     */
    int updateByExample(@Param("record") data record, @Param("example") dataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data
     *
     * @mbggenerated Sat May 30 09:44:25 CST 2020
     */
    int updateByPrimaryKeySelective(data record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data
     *
     * @mbggenerated Sat May 30 09:44:25 CST 2020
     */
    int updateByPrimaryKey(data record);
}