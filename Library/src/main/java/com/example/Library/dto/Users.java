package com.example.Library.dto;

import com.sun.istack.internal.NotNull;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

public class Users implements Serializable {


    public Long id;

    private String name,address;

    private long phonenumber;

    public Users(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public long getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(long phonenumber) {
        this.phonenumber = phonenumber;
    }

    public Users(Long id, String name, String address, long phonenumber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phonenumber = phonenumber;
    }
}
