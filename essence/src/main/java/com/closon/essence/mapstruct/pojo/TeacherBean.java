package com.closon.essence.mapstruct.pojo;

import lombok.Data;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author wangwg
 */
@Data
public class TeacherBean {

    public static Convert convert = Mappers.getMapper(Convert.class);

    /**
     * 老师id
     */
    private String id;

    /**
     * 老师名称
     */
    private String name;

    /**
     * 老师年龄
     */
    private Long age;

    @Mapper
    interface Convert{

        TeacherDTO convertBean2DTO(TeacherBean teacherBean);

        TeacherBean convertDTO2Bean(TeacherDTO teacherDTO);
    }
}
