package com.learn.entity;

public class TClassGroupCourse extends TClassGroupCourseKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_class_group_course.f_course_name
     *
     * @mbg.generated
     */
    private String fCourseName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_class_group_course.f_course_count
     *
     * @mbg.generated
     */
    private Integer fCourseCount;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_class_group_course.f_course_name
     *
     * @return the value of t_class_group_course.f_course_name
     *
     * @mbg.generated
     */
    public String getfCourseName() {
        return fCourseName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_class_group_course.f_course_name
     *
     * @param fCourseName the value for t_class_group_course.f_course_name
     *
     * @mbg.generated
     */
    public void setfCourseName(String fCourseName) {
        this.fCourseName = fCourseName == null ? null : fCourseName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_class_group_course.f_course_count
     *
     * @return the value of t_class_group_course.f_course_count
     *
     * @mbg.generated
     */
    public Integer getfCourseCount() {
        return fCourseCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_class_group_course.f_course_count
     *
     * @param fCourseCount the value for t_class_group_course.f_course_count
     *
     * @mbg.generated
     */
    public void setfCourseCount(Integer fCourseCount) {
        this.fCourseCount = fCourseCount;
    }
}