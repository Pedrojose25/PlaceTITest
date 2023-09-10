package com.pedro.demo.service;

import com.pedro.demo.model.Marca;

import com.pedro.demo.model.Modelo;
import com.pedro.demo.repository.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Id;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class MarcaService implements Serializable {

    @Autowired
    private MarcaRepository repository;

    @Autowired
    private ModeloService modeloService;

    public List<Marca> retornaListaDeMarca() {
        return repository.findAll();
    }

    public Marca inserirMarca(Marca marca) {
        if (!marca.getModelos().isEmpty()) {
            Modelo modelo = modeloService.buscarPorId(marca.getModelos().get(0).getId());
            marca.addModelo(modelo);
//            List<Modelo> modeloEncontrado = new ArrayList<>();
//            for (int i = 0; i < marca.getModelos().size(); i++) {
//                Modelo modelo = modeloService.buscarPorId(marca.getModelos().get(i).getId());
//                marca.addModelo(modelo);
//                repository.save(marca);
//            }
//            System.out.println(marca.getModelos().size());
//            marca.getModelos().forEach((data) -> {
//                System.out.println(data.getId());
//                Modelo modelo = modeloService.buscarPorId(data.getId());
//                marca.addModelo(modelo);
//            });
        }
        var saveRetornado = repository.save(marca);

        return buscarPorId(saveRetornado.getId());
    }

    public void deleteMarca(Long id) {
        repository.deleteById(id);
    }

    public void atualizarMarca(Marca marca) {
        Marca marcaPorId = buscarPorId(marca.getId());
        marcaPorId.setNome(marca.getNome());
        marcaPorId.setAtivo(marca.isAtivo());
        marcaPorId.setCodigoDenatran(marca.getCodigoDenatran());
        marcaPorId.setModelos(marca.getModelos());
        repository.save(marcaPorId);
    }

    public Marca buscarPorId(Long id) {
        return repository.findById(id).orElseThrow();
    }
}
