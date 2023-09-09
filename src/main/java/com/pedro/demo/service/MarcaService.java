package com.pedro.demo.service;

import com.pedro.demo.model.Marca;
import com.pedro.demo.model.Modelo;
import com.pedro.demo.repository.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Id;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;

@Service
@Transactional
public class MarcaService implements Serializable {

    @Autowired
    private MarcaRepository repository;

    public List<Marca> retornaListaDeMarca() {
        return repository.findAll();

    }

    public Marca inserirMarca(Marca marca) {
        return repository.save(marca);
    }

    public void deleteMarca(Long id) {
        repository.deleteById(id);
    }

    public void atualizarMarca(Marca marca) {
        deleteMarca(marca.getId());
        inserirMarca(marca);
    }
    public Marca buscarPorId(Long id){
        return repository.findById(id).orElseThrow();
    }
}
