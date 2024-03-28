package com.example.myspringapi.controller;

import ch.qos.logback.core.model.Model;
import com.example.myspringapi.service.PatronService;
import com.example.myspringapi.model.Patron;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "api/v1/patron")
public class PatronController {

    private final PatronService patronService;

    public PatronController(PatronService patronService) {
        this.patronService = patronService;
    }

    @GetMapping
    public List<Patron> getPatrons() {
        return patronService.getPatrons();
    }

    @PostMapping
    public void createPatron(@RequestBody Patron patron) {
        patronService.createPatron(patron);
    }


    @DeleteMapping(path = "{id}")
    public ResponseEntity<Void> deletePatron(@PathVariable Long id) {
        patronService.deletePatron(id);
        return ResponseEntity.noContent().build();
    }
}
