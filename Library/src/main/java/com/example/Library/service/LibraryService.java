package com.example.Library.service;

import com.example.Library.dto.Books;
import com.example.Library.dto.UserBookHistory;
import com.example.Library.dto.Users;

import java.util.Date;
import java.util.List;

public interface LibraryService {

    List<Users> getAllUsers();
    void addUsers(Users user);

    List<Books> getAllBooks();
    void addBooks(Books books);

    void issueBook(UserBookHistory userbook);
    void returnBook(UserBookHistory usebook);
}
