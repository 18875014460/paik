package com.learn.entity;

public class TTeacher {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_teacher.f_teacher_id
     *
     * @mbg.generated
     */
    private Integer fTeacherId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_teacher.f_teacher_name
     *
     * @mbg.generated
     */
    private String fTeacherName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_teacher.f_teacher_type
     *
     * @mbg.generated
     */
    private Integer fTeacherType;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_teacher.f_teacher_id
     *
     * @return the value of t_teacher.f_teacher_id
     *
     * @mbg.generated
     */
    public Integer getfTeacherId() {
        return fTeacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_teacher.f_teacher_id
     *
     * @param fTeacherId the value for t_teacher.f_teacher_id
     *
     * @mbg.generated
     */
    public void setfTeacherId(Integer fTeacherId) {
        this.fTeacherId = fTeacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_teacher.f_teacher_name
     *
     * @return the value of t_teacher.f_teacher_name
     *
     * @mbg.generated
     */
    public String getfTeacherName() {
        return fTeacherName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_teacher.f_teacher_name
     *
     * @param fTeacherName the value for t_teacher.f_teacher_name
     *
     * @mbg.generated
     */
    public void setfTeacherName(String fTeacherName) {
        this.fTeacherName = fTeacherName == null ? null : fTeacherName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_teacher.f_teacher_type
     *
     * @return the value of t_teacher.f_teacher_type
     *
     * @mbg.generated
     */
    public Integer getfTeacherType() {
        return fTeacherType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_teacher.f_teacher_type
     *
     * @param fTeacherType the value for t_teacher.f_teacher_type
     *
     * @mbg.generated
     */
    public void setfTeacherType(Integer fTeacherType) {
        this.fTeacherType = fTeacherType;
    }
}