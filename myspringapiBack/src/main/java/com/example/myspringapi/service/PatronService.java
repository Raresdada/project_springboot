package com.example.myspringapi.service;

import com.example.myspringapi.repository.PatronRepository;
import com.example.myspringapi.model.Patron;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatronService implements IPatronService {
    private final PatronRepository patronRepository;

    public PatronService(PatronRepository patronRepository) {
        this.patronRepository = patronRepository;
    }

    @Override
    public List<Patron> getPatrons() {
        return patronRepository.findAll();
    }

    @Override
    public void createPatron(Patron patron) {
        patronRepository.save(patron);
    }


    @Override
    public void deletePatron(Long id) {
     patronRepository.findById(id)
     .orElseThrow(() -> new ResourceNotFoundException("Patron with id " + id + " not found"));
        patronRepository.deleteById(id);

    }

}
