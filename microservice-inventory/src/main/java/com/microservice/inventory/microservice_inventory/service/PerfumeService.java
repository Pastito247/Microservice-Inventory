package com.microservice.inventory.microservice_inventory.service;
import com.microservice.inventory.microservice_inventory.model.Perfume;
import com.microservice.inventory.microservice_inventory.repository.PerfumeRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class PerfumeService {
    
    @Autowired
    private PerfumeRepository perfumeRepository;

    
    public List<Perfume> getPerfumes() {
        return perfumeRepository.getPerfumes();
    }

    public Perfume getPerfumeById(int id) {
        return perfumeRepository.getPerfumeById(id);
    }
    public Perfume getPerfumeByName(String nombre) {
        return perfumeRepository.getPerfumeByName(nombre);
    }
    public Perfume addPerfume(Perfume perfume) {
        return perfumeRepository.addPerfume(perfume);
    }
    public Perfume updatePerfume(Perfume perfume) {
        return perfumeRepository.updatePerfume(perfume);
    }
    public String deletePerfume(int id) {
        perfumeRepository.deletePerfume(id);
        return "Perfume eliminado con exito";
    }
    public String deletePerfumeByName(String nombre) {
        perfumeRepository.deletePerfumeByName(nombre);
        return "Perfume " + nombre +" eliminado con exito";
    }

}
