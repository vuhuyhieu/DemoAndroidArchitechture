package com.example.database.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.example.model.Student;

@Entity
public class StudentEntity implements Student {
    @PrimaryKey
    private int id;
    private String name;
    private String avatar;
    private String address;
    private String birthday;

    public StudentEntity(int id, String name, String avatar, String address, String birthday) {
        this.id = id;
        this.name = name;
        this.avatar = avatar;
        this.address = address;
        this.birthday = birthday;
    }

    public StudentEntity(String name, String avatar, String address, String birthday) {
        this.name = name;
        this.avatar = avatar;
        this.address = address;
        this.birthday = birthday;
    }

    public StudentEntity() {
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getAvatar() {
        return this.avatar;
    }

    @Override
    public String getAddress() {
        return this.address;
    }

    @Override
    public String getBirthday() {
        return this.birthday;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
