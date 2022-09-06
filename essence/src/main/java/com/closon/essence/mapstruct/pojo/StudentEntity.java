package com.closon.essence.mapstruct.pojo;

import lombok.Data;

/**
 * @author wangwg
 */
@Data
public class StudentEntity {

    /**
     * 学生id
     */
    private int id;

    /**
     * 学生名称
     */
    private String name;

    /**
     * 学生年龄
     */
    private long age;

    /**
     * 学校类型
     */
    private String schoolType;

    @Override
    public String toString() {
        return "StudentEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", schoolType='" + schoolType + '\'' +
                '}';
    }
}
