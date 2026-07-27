package com.zenith_computer_academy.academy_mgt.service;

import com.zenith_computer_academy.academy_mgt.entity.TeachingNote;
import com.zenith_computer_academy.academy_mgt.repository.TeachingNoteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeachingNoteService {

    private final TeachingNoteRepository repository;

    public TeachingNoteService(
            TeachingNoteRepository repository
    ) {
        this.repository = repository;
    }

    public List<TeachingNote> getAllNotes() {
        return repository.findAll();
    }

    public TeachingNote getNote(Integer id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Note not found"));
    }

    public TeachingNote saveNote(
            TeachingNote note
    ) {
        return repository.save(note);
    }

    public TeachingNote updateNote(
            Integer id,
            TeachingNote note
    ) {
        TeachingNote existing =
                getNote(id);

        existing.setTitle(
                note.getTitle()
        );

        existing.setNote(
                note.getNote()
        );

        return repository.save(existing);
    }

    public void deleteNote(
            Integer id
    ) {
        repository.deleteById(id);
    }
}