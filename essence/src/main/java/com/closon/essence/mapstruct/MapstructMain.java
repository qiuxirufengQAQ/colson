package com.closon.essence.mapstruct;

import com.closon.essence.mapstruct.enums.SchoolTypeEnum;
import com.closon.essence.mapstruct.pojo.StudentBean;
import com.closon.essence.mapstruct.pojo.StudentDTO;
import com.closon.essence.mapstruct.pojo.TeacherBean;

import java.util.Collections;

/**
 * @author wangwg
 */
public class MapstructMain {

    public static void main(String[] args) {

        StudentBean studentBean = new StudentBean();
        studentBean.setId(1);
        studentBean.setAge(20l);
        studentBean.setSchoolType(SchoolTypeEnum.COLLEGE_SCHOOL);
        studentBean.setName("张三");

        TeacherBean teacherBean = new TeacherBean();
        teacherBean.setAge(20l);
        teacherBean.setId("2");
        teacherBean.setName("李四");
        studentBean.setTeacherBeans(Collections.singletonList(teacherBean));

        StudentDTO studentDTO = StudentBean.convert.convertBean2DTO(studentBean);
        System.out.println(studentDTO);
    }
}
