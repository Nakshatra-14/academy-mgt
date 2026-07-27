package com.zenith_computer_academy.academy_mgt.controller;

import com.zenith_computer_academy.academy_mgt.entity.TeachingNote;
import com.zenith_computer_academy.academy_mgt.service.TeachingNoteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/teaching-note")
@CrossOrigin("*")
public class TeachingNoteController {

    private final TeachingNoteService service;

    public TeachingNoteController(
            TeachingNoteService service
    ) {
        this.service = service;
    }

    @GetMapping
    public List<TeachingNote> getAllNotes() {
        return service.getAllNotes();
    }

    @GetMapping("/{id}")
    public TeachingNote getNote(
            @PathVariable Integer id
    ) {
        return service.getNote(id);
    }

    @PostMapping
    public TeachingNote saveNote(
            @RequestBody TeachingNote note
    ) {
        return service.saveNote(note);
    }

    @PutMapping("/{id}")
    public TeachingNote updateNote(
            @PathVariable Integer id,
            @RequestBody TeachingNote note
    ) {
        return service.updateNote(
                id,
                note
        );
    }

    @DeleteMapping("/{id}")
    public void deleteNote(
            @PathVariable Integer id
    ) {
        service.deleteNote(id);
    }
}