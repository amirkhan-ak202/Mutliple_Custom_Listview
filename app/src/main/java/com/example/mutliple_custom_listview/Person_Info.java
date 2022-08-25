package com.example.mutliple_custom_listview;

public class Person_Info
{
    private String name;
    private String Birthdate;
    private String sex;

    public Person_Info(String name, String birthdate, String sex) {
        this.name = name;
        Birthdate = birthdate;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthdate() {
        return Birthdate;
    }

    public void setBirthdate(String birthdate) {
        Birthdate = birthdate;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
