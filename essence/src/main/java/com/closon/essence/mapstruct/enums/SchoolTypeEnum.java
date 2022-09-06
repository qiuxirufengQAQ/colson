package com.closon.essence.mapstruct.enums;

/**
 * @author wangwg
 */
public enum SchoolTypeEnum {

    HIGH_SCHOOL("HIGH_SCHOOL", "高中"),

    COLLEGE_SCHOOL("COLLEGE_SCHOOL", "大学"),

    ;
    private String code;

    private String name;

    SchoolTypeEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
