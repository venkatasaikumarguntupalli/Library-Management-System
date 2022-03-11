package com.example.Library.entity;


import com.sun.istack.internal.NotNull;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="users")
public class UsersEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",nullable=false)
    public Long id;

    @NotBlank(message="fields cannot be null")
    private String name,address;

    private long phonenumber;

    public UsersEntity(){

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

    public UsersEntity(@NotNull Long id, @NotBlank String name, @NotBlank String address, long phonenumber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phonenumber = phonenumber;
    }
}
