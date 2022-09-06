package com.closon.essence.mapstruct.pojo;

import lombok.Data;

import java.util.List;

/**
 * @author wangwg
 */
@Data
public class StudentDTO {

    /**
     * 学生id
     */
    private Integer studentId;

    /**
     * 学生名称
     */
    private String name;

    /**
     * 学生年龄
     */
    private Long age;

    /**
     * 学校类型
     */
    private String schoolType;

    /**
     * 老师列表
     */
    private List<TeacherDTO> teacherDTOS;

    @Override
    public String toString() {
        return "StudentDTO{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", schoolType='" + schoolType + '\'' +
                ", teacherDTOS=" + teacherDTOS +
                '}';
    }
}
