package com.learn.paik.dao;

import com.learn.entity.TClassGroupCourse;
import com.learn.entity.TClassGroupCourseKey;

public interface TClassGroupCourseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_class_group_course
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(TClassGroupCourseKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_class_group_course
     *
     * @mbg.generated
     */
    int insert(TClassGroupCourse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_class_group_course
     *
     * @mbg.generated
     */
    int insertSelective(TClassGroupCourse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_class_group_course
     *
     * @mbg.generated
     */
    TClassGroupCourse selectByPrimaryKey(TClassGroupCourseKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_class_group_course
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TClassGroupCourse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_class_group_course
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TClassGroupCourse record);
}