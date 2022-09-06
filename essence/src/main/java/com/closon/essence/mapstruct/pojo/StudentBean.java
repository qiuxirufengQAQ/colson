package com.closon.essence.mapstruct.pojo;

import com.closon.essence.mapstruct.enums.SchoolTypeEnum;

import lombok.Data;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author wangwg
 */
@Data
public class StudentBean {

    public static Convert convert = Mappers.getMapper(Convert.class);

    /**
     * 学生id
     */
    private Integer id;

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
    private SchoolTypeEnum schoolType;

    /**
     * 老师列表
     */
    private List<TeacherBean> teacherBeans;


    @Mapper(imports = StudentBean.class)
    public interface Convert {

        @Mappings({
                @Mapping(target = "studentId", source = "id"),
                @Mapping(target = "teacherDTOS", expression = "java(StudentBean.convertTeacherBeanList(studentBean.getTeacherBeans()))"),
                @Mapping(target = "schoolType", expression = "java(studentBean.getSchoolType()==null?\"\":studentBean.getSchoolType().getCode())")
        })
        StudentDTO convertBean2DTO(StudentBean studentBean);

        @Mappings({
                @Mapping(target = "id", source = "studentId"),
                @Mapping(target = "teacherBeans", expression = "java(StudentBean.convertTeacherDTOList(studentDTO.getTeacherDTOS()))")
        })
        StudentBean convertDTO2Bean(StudentDTO studentDTO);

        @Mappings({
                @Mapping(target = "schoolType", expression = "java(studentBean.getSchoolType()==null?\"\":studentBean.getSchoolType().getCode())")
        })
        StudentEntity convertBean2Entity(StudentBean studentBean);
    }

    public static List<TeacherDTO> convertTeacherBeanList(List<TeacherBean> teacherBeans) {
        if (CollectionUtils.isEmpty(teacherBeans)) {
            return new ArrayList<>();
        }
        return teacherBeans.stream().map(TeacherBean.convert::convertBean2DTO).collect(Collectors.toList());
    }

    public static List<TeacherBean> convertTeacherDTOList(List<TeacherDTO> teacherDTOS) {
        if (CollectionUtils.isEmpty(teacherDTOS)) {
            return new ArrayList<>();
        }
        return teacherDTOS.stream().map(TeacherBean.convert::convertDTO2Bean).collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "StudentBean{" + "id=" + id + ", name='" + name + '\'' + ", age=" + age + ", schoolType=" + schoolType + '}';
    }
}
