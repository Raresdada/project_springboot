package com.example.myspringapi.repository;

import com.example.myspringapi.model.Patron;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatronRepository extends JpaRepository<Patron, Long> {

}
