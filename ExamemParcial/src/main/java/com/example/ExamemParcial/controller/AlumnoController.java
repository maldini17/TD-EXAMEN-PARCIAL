package com.example.ExamemParcial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ExamemParcial.models.AlumnoModel;
import com.example.ExamemParcial.services.AlumnoService;

@RestController
@RequestMapping("Alumno")
public class AlumnoController {

    @Autowired
    AlumnoService alumnoService;

    @GetMapping("/getAll")
    public List<AlumnoModel> getAll() {
        return alumnoService.getAll();
    }

    @PostMapping("/create")
    public AlumnoModel create(@RequestBody AlumnoModel model) {
        return alumnoService.add(model);
    }
}