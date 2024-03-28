package com.example.myspringapi.service;

import com.example.myspringapi.model.Patron;

import java.util.List;

public interface IPatronService {
    List<Patron> getPatrons();

    void createPatron(Patron patron);

    void deletePatron(Long id);
}
