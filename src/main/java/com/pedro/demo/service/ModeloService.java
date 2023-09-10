package com.pedro.demo.service;

import com.pedro.demo.model.Modelo;
import com.pedro.demo.repository.ModeloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;

@Service
@Transactional
public class ModeloService implements Serializable {
    @Autowired
    private ModeloRepository repository;

    public List<Modelo> listarModelo() {
        return repository.findAll();
    }

    public List<Modelo> inserirModelo(Modelo modelo) {
        repository.save(modelo);
        return listarModelo();
    }

    public List<Modelo> deletar(Long id) {
        repository.deleteById(id);
        return listarModelo();
    }

    public List<Modelo> alterar(Modelo modelo) {
        repository.deleteById(modelo.getId());
        inserirModelo(modelo);
        return listarModelo();
    }

    public Modelo buscarPorId(Long id) {
        return repository.findById(id).orElseThrow();
    }

}
