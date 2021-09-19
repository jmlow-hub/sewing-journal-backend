package com.example.Sewing.Journal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(origins = "https://sewing-journal.web.app", allowedHeaders = "*")
public class MakeController {

    @Autowired
    public IMakeRepository repository;

    @GetMapping("/makes")
    public ResponseEntity<Make> getMakes() {
        return new ResponseEntity(this.repository.findAll(), HttpStatus.OK);
    }

    @PostMapping("/make")
    public ResponseEntity addMake(@RequestBody Make make) {

        this.repository.save(make);

        return new ResponseEntity("Saved!", HttpStatus.OK);
    }

    @PutMapping("/make/{id}")
    public ResponseEntity<Make> updateMake(@RequestBody Make make, @PathVariable int id) {
        this.repository.findById(id)
                .map(item -> {
                    item.setDate(make.getDate());
                    item.setDesigner(make.getDesigner());
                    item.setPattern(make.getPattern());
                    item.setStyle(make.getStyle());
                    item.setSize(make.getSize());
                    item.setBust(make.getBust());
                    item.setWaist(make.getWaist());
                    item.setHips(make.getHips());
                    item.setNotes(make.getNotes());
                    return this.repository.save(item);
                });

        return new ResponseEntity("Updated", HttpStatus.OK);
    }

    @DeleteMapping("/make/{id}")
    public ResponseEntity<Make> deleteMake(@RequestBody Make make, @PathVariable int id) {
      this.repository.deleteById(id);

        return new ResponseEntity("Deleted!", HttpStatus.OK);
    }

    //searches
    @GetMapping("/makes/designer")
    public ResponseEntity<Make> findByDesigner(@RequestParam String designer) {

        return new ResponseEntity(this.repository.findByDesigner(designer), HttpStatus.OK);
    }

    @GetMapping("/makes/pattern")
    public ResponseEntity<Make> findByPattern(@RequestParam String pattern) {

        return new ResponseEntity(this.repository.findByPattern(pattern), HttpStatus.OK);
    }

    @GetMapping("/makes/style")
    public ResponseEntity<Make> findByStyle(@RequestParam String style) {

        return new ResponseEntity(this.repository.findByStyle(style), HttpStatus.OK);
    }




}
