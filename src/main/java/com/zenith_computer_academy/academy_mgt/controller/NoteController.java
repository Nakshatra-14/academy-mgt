package com.zenith_computer_academy.academy_mgt.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.zenith_computer_academy.academy_mgt.dto.RequestNote;
import com.zenith_computer_academy.academy_mgt.entity.Note;
import com.zenith_computer_academy.academy_mgt.service.NoteService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/note")
@CrossOrigin("*")
public class NoteController {

    private NoteService service;

    public NoteController(NoteService service)
    {
        this.service = service;
    }

    @PostMapping
    public Note addNote(
            @Valid
            @RequestBody
            RequestNote request)
    {
        return service.addNote(request);
    }

    @PutMapping("/{id}")
    public Note updateNote(
            @PathVariable Integer id,
            @Valid
            @RequestBody
            RequestNote request)
    {
        return service.updateNote(id, request);
    }

    @GetMapping
    public List<Note> getAll()
    {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Note getById(
            @PathVariable Integer id)
    {
        return service.getById(id);
    }

    @GetMapping("/pending")
    public List<Note> getPending()
    {
        return service.getPending();
    }

    @PutMapping("/complete/{id}")
    public Note markCompleted(
            @PathVariable Integer id)
    {
        return service.markCompleted(id);
    }

    @DeleteMapping("/{id}")
    public void deleteNote(
            @PathVariable Integer id)
    {
        service.deleteNote(id);
    }
}