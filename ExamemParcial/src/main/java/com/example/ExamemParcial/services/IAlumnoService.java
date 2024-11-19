package com.example.ExamemParcial.services;

import java.util.List;

import com.example.ExamemParcial.models.AlumnoModel;

public interface IAlumnoService {
    public AlumnoModel add(AlumnoModel model);

    public AlumnoModel update(AlumnoModel model);

    public boolean delete(int id);

    public List<AlumnoModel> getAll();

    public AlumnoModel findById(int id);
}
