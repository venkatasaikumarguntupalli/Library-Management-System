package com.example.Library.entity;

import com.example.Library.dto.Books;
import com.example.Library.dto.Users;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name="userbookhistory")
public class UserBookHistoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String startdate;
    private String enddate;

    @ManyToOne
    @JoinColumn(name = "userid", referencedColumnName = "id")
    UsersEntity user;


    @ManyToOne
    @JoinColumn(name = "bookid", referencedColumnName = "id")
    BooksEntity book;
    public UserBookHistoryEntity(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    public UsersEntity getUser() {
        return user;
    }

    public void setUser(UsersEntity user) {
        this.user = user;
    }

    public BooksEntity getBook() {
        return book;
    }

    public void setBook(BooksEntity book) {
        this.book = book;
    }

    public UserBookHistoryEntity(String startdate, String enddate,Long book,Long user) {

        this.startdate = startdate;
        this.enddate = enddate;
        this.user.id = user;
        this.book.id = book;
    }
}
