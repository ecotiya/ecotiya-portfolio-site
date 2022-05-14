package com.app.ecotiya.domain.repository;

import org.apache.ibatis.annotations.Mapper;

import com.app.ecotiya.domain.entity.MSiteCommentKinds;

@Mapper
public interface MSiteCommentKindsMapper {

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * m_site_comment_kinds
   *
   * @mbg.generated
   */
  int deleteByPrimaryKey(String comentKindCode);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * m_site_comment_kinds
   *
   * @mbg.generated
   */
  int insert(MSiteCommentKinds row);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * m_site_comment_kinds
   *
   * @mbg.generated
   */
  int insertSelective(MSiteCommentKinds row);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * m_site_comment_kinds
   *
   * @mbg.generated
   */
  MSiteCommentKinds selectByPrimaryKey(String comentKindCode);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * m_site_comment_kinds
   *
   * @mbg.generated
   */
  int updateByPrimaryKeySelective(MSiteCommentKinds row);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * m_site_comment_kinds
   *
   * @mbg.generated
   */
  int updateByPrimaryKey(MSiteCommentKinds row);
}
