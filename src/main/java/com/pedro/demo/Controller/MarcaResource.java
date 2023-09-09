package com.pedro.demo.Controller;

import com.pedro.demo.model.Marca;
import com.pedro.demo.service.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/marca")
public class MarcaResource {

    @Autowired
    MarcaService service;

    @GetMapping()
    public ResponseEntity<List<Marca>> retornaTodosMarca() {
        List<Marca> listaMarca = service.retornaListaDeMarca();

        return ResponseEntity.ok(listaMarca);
    }
}
