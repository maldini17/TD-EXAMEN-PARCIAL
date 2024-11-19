package com.example.ExamemParcial.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ExamemParcial.models.AlumnoModel;
import com.example.ExamemParcial.repository.IAlumnoRepository;

@Service
public class AlumnoService implements IAlumnoService {

    @Autowired
    IAlumnoRepository repository;

    @Override
    public AlumnoModel add(AlumnoModel model){
        return repository.save(model); 
    }

    @Override
    public AlumnoModel update(AlumnoModel model){
        return repository.save(model); 
    }

    @Override
    public boolean delete(int id){
        repository.deleteById(id);
        return true; 
    }

    @Override
    public List<AlumnoModel> getAll(){
        return (List<AlumnoModel>)repository.findAll(); 
    }

    @Override
    public AlumnoModel findById(int id){
        return repository.findById(id).get();
    }
    
    
}
