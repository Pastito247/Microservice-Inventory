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

    @GetMapping
    public Perfume getPerfumeById(@RequestParam int id) {
        return perfumeService.getPerfumeById(id);
    }

    @GetMapping
    public Perfume getPerfumeByName(@RequestParam String nombre) {
        return perfumeService.getPerfumeByName(nombre);
    }

    @PostMapping
    public Perfume addPerfume(@RequestParam Perfume perfume) {
        return perfumeService.addPerfume(perfume);
    }

    public Perfume updatePerfume(@RequestParam Perfume perfume) {
        return perfumeService.updatePerfume(perfume);
    }

    public String deletePerfume(@RequestParam int id) {
        return perfumeService.deletePerfume(id);
    }
    public String deletePerfumeByName(@RequestParam String nombre) {
        return perfumeService.deletePerfumeByName(nombre);
    }

    
}
