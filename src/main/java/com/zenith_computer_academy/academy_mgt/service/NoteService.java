package com.zenith_computer_academy.academy_mgt.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zenith_computer_academy.academy_mgt.dto.RequestNote;
import com.zenith_computer_academy.academy_mgt.entity.Note;
import com.zenith_computer_academy.academy_mgt.repository.NoteRepository;

@Service
public class NoteService {

    private NoteRepository repo;

    public NoteService(NoteRepository repo)
    {
        this.repo = repo;
    }

    public Note addNote(RequestNote request)
    {
        Note note = new Note();

        note.setTitle(request.getTitle());
        note.setNoteText(request.getNoteText());
        note.setDueDate(request.getDueDate());

        if(request.getStatus() == null
                || request.getStatus().isBlank())
        {
            note.setStatus("PENDING");
        }
        else
        {
            note.setStatus(request.getStatus());
        }

        return repo.save(note);
    }

    public Note updateNote(
            Integer id,
            RequestNote request)
    {
        Note note =
            repo.findById(id)
            .orElseThrow(() ->
                new RuntimeException(
                    "Note not found"));

        note.setTitle(request.getTitle());
        note.setNoteText(request.getNoteText());
        note.setDueDate(request.getDueDate());
        note.setStatus(request.getStatus());

        return repo.save(note);
    }

    public Note getById(Integer id)
    {
        return repo.findById(id)
                .orElseThrow(() ->
                    new RuntimeException(
                        "Note not found"));
    }

    public List<Note> getAll()
    {
        return repo.findAll();
    }

    public List<Note> getPending()
    {
        return repo.findByStatus("PENDING");
    }

    public void deleteNote(Integer id)
    {
        if(repo.existsById(id))
        {
            repo.deleteById(id);
        }
        else
        {
            throw new RuntimeException(
                "Note not found");
        }
    }

    public Note markCompleted(Integer id)
    {
        Note note =
            repo.findById(id)
            .orElseThrow(() ->
                new RuntimeException(
                    "Note not found"));

        note.setStatus("COMPLETED");

        return repo.save(note);
    }
}