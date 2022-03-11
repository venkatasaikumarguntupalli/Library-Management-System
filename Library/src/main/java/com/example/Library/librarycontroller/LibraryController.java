package com.example.Library.librarycontroller;

import com.example.Library.dto.Books;
import com.example.Library.dto.UserBookHistory;
import com.example.Library.dto.Users;
import com.example.Library.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@RestController
public class LibraryController {

    @Autowired
    LibraryService libraryService;

    @GetMapping("/Users")
    public List<Users> getAllUsers(){
        return libraryService.getAllUsers();
    }

    @GetMapping("/Books")
    public List<Books> getAllBooks(){
        return libraryService.getAllBooks();
    }

    @PostMapping("/Addusers")
    public void addUsers(@RequestBody @Valid Users user){
        libraryService.addUsers(user);
    }

    @PostMapping("/Addbooks")
    public void addBooks(@RequestBody @Valid Books book){
        libraryService.addBooks(book);
    }

    @PostMapping( "/history")
    public void add2(@RequestBody UserBookHistory s){
        libraryService.issueBook(s);
    }

    @PostMapping("/return")
    public void returnbook(@RequestBody UserBookHistory s){
        libraryService.returnBook(s);
    }
}
