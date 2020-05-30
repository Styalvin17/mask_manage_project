package com.maskmanage.mapper;

import com.maskmanage.entity.usage;
import com.maskmanage.entity.usageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface usageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usage
     *
     * @mbggenerated Sat May 30 09:44:25 CST 2020
     */
    int countByExample(usageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usage
     *
     * @mbggenerated Sat May 30 09:44:25 CST 2020
     */
    int deleteByExample(usageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usage
     *
     * @mbggenerated Sat May 30 09:44:25 CST 2020
     */
    int deleteByPrimaryKey(Integer usageid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usage
     *
     * @mbggenerated Sat May 30 09:44:25 CST 2020
     */
    int insert(usage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usage
     *
     * @mbggenerated Sat May 30 09:44:25 CST 2020
     */
    int insertSelective(usage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usage
     *
     * @mbggenerated Sat May 30 09:44:25 CST 2020
     */
    List<usage> selectByExample(usageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usage
     *
     * @mbggenerated Sat May 30 09:44:25 CST 2020
     */
    usage selectByPrimaryKey(Integer usageid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usage
     *
     * @mbggenerated Sat May 30 09:44:25 CST 2020
     */
    int updateByExampleSelective(@Param("record") usage record, @Param("example") usageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usage
     *
     * @mbggenerated Sat May 30 09:44:25 CST 2020
     */
    int updateByExample(@Param("record") usage record, @Param("example") usageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usage
     *
     * @mbggenerated Sat May 30 09:44:25 CST 2020
     */
    int updateByPrimaryKeySelective(usage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usage
     *
     * @mbggenerated Sat May 30 09:44:25 CST 2020
     */
    int updateByPrimaryKey(usage record);
}