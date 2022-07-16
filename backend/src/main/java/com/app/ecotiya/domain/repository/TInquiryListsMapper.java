package com.app.ecotiya.domain.repository;

import org.apache.ibatis.annotations.Mapper;

import com.app.ecotiya.domain.entity.TInquiryLists;

@Mapper
public interface TInquiryListsMapper {

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * t_inquiry_lists
   *
   * @mbg.generated
   */
  int insert(TInquiryLists row);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * t_inquiry_lists
   *
   * @mbg.generated
   */
  int insertSelective(TInquiryLists row);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * t_inquiry_lists
   *
   * @mbg.generated
   */
  TInquiryLists selectByPrimaryKey(Long inquiryId);

  /**
   * ユーザからの問い合わせをデータベースに追加します。追加時にkeyを取得した上で、追加を行います。
   *
   * @return プライマリーキー
   */
  int insertReturnId(TInquiryLists row);
}
