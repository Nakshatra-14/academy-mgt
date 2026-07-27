package com.zenith_computer_academy.academy_mgt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zenith_computer_academy.academy_mgt.entity.Note;

@Repository
public interface NoteRepository
extends JpaRepository<Note,Integer>
{
    List<Note> findByStatus(String status);
}
