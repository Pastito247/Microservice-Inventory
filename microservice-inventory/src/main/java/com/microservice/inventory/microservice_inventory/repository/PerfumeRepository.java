package com.microservice.inventory.microservice_inventory.repository;
import com.microservice.inventory.microservice_inventory.model.Perfume;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;


@Repository
public class PerfumeRepository {

    List<Perfume> perfumes = new ArrayList<>();
    

    public List<Perfume> getPerfumes() {
        return perfumes;
    }

    public Perfume getPerfumeById(int id) {
        for (Perfume perfume : perfumes) {
            if (perfume.getId() == id) {
                return perfume;
            }
        }
        return null;
    }

    public Perfume getPerfumeByName(String nombre) {
        for (Perfume perfume : perfumes) {
            if (perfume.getNombre().equalsIgnoreCase(nombre)) {
                return perfume;
            }
        }
        return null;
    }

    public Perfume addPerfume(Perfume perfume) {
        perfumes.add(perfume);
        return perfume;
    }

    public Perfume updatePerfume(Perfume perfume) {
        int id = 0;
        int idPosicion = 0;

        for (int i = 0; i < perfumes.size(); i++) {
            if (perfumes.get(i).getId() == perfume.getId()) {
                id = perfume.getId();
                idPosicion = i;
            }
        }

        Perfume perfume1 = new Perfume();
        perfume1.setId(id);
        perfume1.setNombre(perfume.getNombre());
        perfume1.setMarca(perfume.getMarca());
        perfume1.setPrecio(perfume.getPrecio());
        perfume1.setTipoFragancia(perfume.getTipoFragancia());
        perfume1.setVolumenEnMililitros(perfume.getVolumenEnMililitros());
        perfume1.setGenero(perfume.getGenero());
        perfumes.set(idPosicion, perfume1);
        return perfume1;
        
    }

    public boolean deletePerfume(int id) {
        for (int i = 0; i < perfumes.size(); i++) {
            if (perfumes.get(i).getId() == id) {
                perfumes.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean deletePerfumeByName(String nombre) {
        for (int i = 0; i < perfumes.size(); i++) {
            if (perfumes.get(i).getNombre().equalsIgnoreCase(nombre)) {
                perfumes.remove(i);
                return true;
            }
        }
        return false;
    }



}
