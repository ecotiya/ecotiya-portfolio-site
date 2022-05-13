package com.app.ecotiya.domain.repository;

import com.app.ecotiya.domain.entity.TInquiryLists;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TInquiryListsMapper {

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_inquiry_lists
     * @mbg.generated
     */
    int deleteByPrimaryKey (Long inquiryId);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_inquiry_lists
     * @mbg.generated
     */
    int insert (TInquiryLists row);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_inquiry_lists
     * @mbg.generated
     */
    int insertSelective (TInquiryLists row);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_inquiry_lists
     * @mbg.generated
     */
    TInquiryLists selectByPrimaryKey (Long inquiryId);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_inquiry_lists
     * @mbg.generated
     */
    int updateByPrimaryKeySelective (TInquiryLists row);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_inquiry_lists
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs (TInquiryLists row);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_inquiry_lists
     * @mbg.generated
     */
    int updateByPrimaryKey (TInquiryLists row);
}