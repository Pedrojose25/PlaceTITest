package com.pedro.demo.Controller;

import com.pedro.demo.model.Marca;
import com.pedro.demo.model.Modelo;
import com.pedro.demo.service.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class ModeloResource {
    @Autowired
    MarcaService service;

}
