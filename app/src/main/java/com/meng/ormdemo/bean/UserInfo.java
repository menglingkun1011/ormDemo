package com.meng.ormdemo.bean;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by MENG on 2017/2/22.
 */
@DatabaseTable(tableName = "user")
public class UserInfo {

    @DatabaseField(columnName = "name")
    private String name;
    @DatabaseField(columnName = "address")
    private String address;
    @DatabaseField(columnName = "sex")
    private int sex;

    @DatabaseField(columnName = "t_id",generatedId = true)
    private int id;

    //bean的要求
//    1.无参构造函数
//    2.get和set方法
//    3.配置表名 @DatabaseTable(tableName = "user")
//    4.配置表字段@DatabaseField(columnName = "address")  成员变量对应的列名
//    5.generatedId = true  作用：主键、id自增长
//
    public UserInfo() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
