package com.pedro.demo.service;

import com.pedro.demo.model.Marca;
import com.pedro.demo.repository.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;

@Service
@Transactional
public class MarcaService implements Serializable {

    @Autowired
    MarcaRepository repository;

    public List<Marca> retornaListaDeMarca() {
        return repository.findAll();
    }
}
