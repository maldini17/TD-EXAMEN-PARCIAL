package com.example.ExamemParcial.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.ExamemParcial.models.AlumnoModel;
@Repository
public interface IAlumnoRepository 
extends CrudRepository<AlumnoModel, Integer> {
    
}
