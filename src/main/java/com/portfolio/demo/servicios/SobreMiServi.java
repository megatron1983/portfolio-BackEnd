package com.portfolio.demo.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.demo.model.SobreMi;
import com.portfolio.demo.repository.RepoSobreMi;
@Service
public class SobreMiServi implements InterfaceSobreMi{
    @Autowired
    private RepoSobreMi baseRepo;

    @Override
    public List<SobreMi> listarTodo() {
        return baseRepo.findAll();
    }

    @Override
    public void actualizar( SobreMi sobre) {
        
        baseRepo.save(sobre);
    }

   
    @Override
    public SobreMi buscar(int id) {
        return baseRepo.findById(id).orElse(null);
    }

    @Override
    public void eliminar(int id) {
        baseRepo.deleteById(id);
    }
}
