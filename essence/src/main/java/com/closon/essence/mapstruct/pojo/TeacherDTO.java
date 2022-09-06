package com.closon.essence.mapstruct.pojo;

import lombok.Data;

/**
 * @author wangwg
 */
@Data
public class TeacherDTO {

    /**
     * 老师id
     */
    private Integer id;

    /**
     * 老师名称
     */
    private String name;

    /**
     * 老师年龄
     */
    private Long age;

    @Override
    public String toString() {
        return "TeacherDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
