package com.learn.entity;

public class TCourseFlag {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_course_flag.f_course_flag_id
     *
     * @mbg.generated
     */
    private Integer fCourseFlagId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_course_flag.f_course_flag_name
     *
     * @mbg.generated
     */
    private String fCourseFlagName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_course_flag.f_course_flag_id
     *
     * @return the value of t_course_flag.f_course_flag_id
     *
     * @mbg.generated
     */
    public Integer getfCourseFlagId() {
        return fCourseFlagId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_course_flag.f_course_flag_id
     *
     * @param fCourseFlagId the value for t_course_flag.f_course_flag_id
     *
     * @mbg.generated
     */
    public void setfCourseFlagId(Integer fCourseFlagId) {
        this.fCourseFlagId = fCourseFlagId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_course_flag.f_course_flag_name
     *
     * @return the value of t_course_flag.f_course_flag_name
     *
     * @mbg.generated
     */
    public String getfCourseFlagName() {
        return fCourseFlagName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_course_flag.f_course_flag_name
     *
     * @param fCourseFlagName the value for t_course_flag.f_course_flag_name
     *
     * @mbg.generated
     */
    public void setfCourseFlagName(String fCourseFlagName) {
        this.fCourseFlagName = fCourseFlagName == null ? null : fCourseFlagName.trim();
    }
}