package com.microservice.inventory.microservice_inventory.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.microservice.inventory.microservice_inventory.model.Perfume;
import com.microservice.inventory.microservice_inventory.service.PerfumeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/inventario")
public class PerfumeController {

    @Autowired
    private PerfumeService perfumeService;

    @GetMapping
    public List<Perfume> getPerfumes() {
        return perfumeService.getPerfumes();
    }

    // Obtener un perfume por su ID
    @GetMapping("{id}")
    public Perfume getPerfumeById(@PathVariable int id) {
        return perfumeService.getPerfumeById(id);
    }

    // Obtener un perfume por su nombre
    @GetMapping("nombre/{nombre}")
    public Perfume getPerfumeByName(@PathVariable String nombre) {
        return perfumeService.getPerfumeByName(nombre);
    }

    // Agregar un nuevo perfume
    @PostMapping
    public Perfume addPerfume(@RequestBody Perfume perfume) {
        return perfumeService.addPerfume(perfume);
    }

    // Actualizar un perfume
    @PutMapping
    public Perfume updatePerfume(@RequestBody Perfume perfume) {
        return perfumeService.updatePerfume(perfume);
    }

    // Eliminar un perfume por ID
    @DeleteMapping("{id}")
    public String deletePerfume(@PathVariable int id) {
        return perfumeService.deletePerfume(id);
    }

    // Eliminar un perfume por nombre
    @DeleteMapping("nombre/{nombre}")
    public String deletePerfumeByName(@PathVariable String nombre) {
        return perfumeService.deletePerfumeByName(nombre);
    }
}
