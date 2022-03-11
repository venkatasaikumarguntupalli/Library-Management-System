package com.example.Library.dto;

import java.io.Serializable;
import java.util.Date;

public class UserBookHistory implements Serializable {

    private Long id;
    private Long userid;
    private Long bookid;
    private String startdate;
    private String enddate;

    public UserBookHistory(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Long getBookid() {
        return bookid;
    }

    public void setBookid(Long bookid) {
        this.bookid = bookid;
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

    public UserBookHistory(Long id, Long userid, Long bookid, String startdate, String enddate) {
        this.id = id;
        this.userid = userid;
        this.bookid = bookid;
        this.startdate = startdate;
        this.enddate = enddate;
    }
}
