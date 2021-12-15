package com.utcc.momandkit;

public class User {
    private int id,old;
    private float weight,height,head;
    private String name,birthday,sex,bloodGroup;

    public User() {
    }

    public User(int id, int old, float weight, float height, float head, String name, String birthday, String sex, String bloodGroup) {
        this.id = id;
        this.old = old;
        this.weight = weight;
        this.height = height;
        this.head = head;
        this.name = name;
        this.birthday = birthday;
        this.sex = sex;
        this.bloodGroup = bloodGroup;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getHead() {
        return head;
    }

    public void setHead(float head) {
        this.head = head;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
}
