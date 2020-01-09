package com.ngarambe.practice;

public class Course extends Student {
    private String courseId;
    private String courseDescription;
    private int courseCredit;

    public Course(int id, String name, int age, String courseId, String courseDescription, int courseCredit) {
        super(id, name, age);

        this.courseId = courseId;
        this.courseDescription = courseDescription;
        this.courseCredit = courseCredit;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public int getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(int courseCredit) {
        this.courseCredit = courseCredit;
    }

    @Override
    public void studying() {
        System.out.println("This student is taking this course with following details :" +"CourseID : "
                                                                                         + this.courseId +","
                                                                                         + "CourseDescription :"
                                                                                         + this.courseDescription+","
                                                                                         + "CourseCredits :"
                                                                                         + this.courseCredit);
    }
}
