package com.pedro.demo.Controller;


import com.pedro.demo.model.Modelo;
import com.pedro.demo.service.MarcaService;
import com.pedro.demo.service.ModeloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;


import java.nio.file.Path;
import java.util.List;
@RestController
@RequestMapping("/modelo")
public class ModeloResource {
    @Autowired
    ModeloService service;

    @GetMapping
    public ResponseEntity<List<Modelo>> buscarModelos(){
       List<Modelo> listarModelos = service.listarModelo();
       return ResponseEntity.ok(listarModelos);
    }

    @PostMapping
    public ResponseEntity<List<Modelo>> inserirModelo(@RequestBody Modelo modelo) {
        List<Modelo> inserirModelos = service.inserirModelo(modelo);
        return ResponseEntity.ok(inserirModelos);
    }

    @PutMapping
    public ResponseEntity<List<Modelo>> alterar(@RequestBody Modelo modelo){
        List<Modelo> alterar = service.alterar(modelo);
        return ResponseEntity.ok(alterar);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<List<Modelo>> deletar(@PathVariable("id") Long id){
        List<Modelo> deletar = service.deletar(id);
        return ResponseEntity.ok(deletar);
    }


    @GetMapping(path = "/{id}")
    public ResponseEntity<Modelo> buscarPorId(@PathVariable("id") Long id) {
        Modelo buscarId = service.buscarPorId(id);
        return ResponseEntity.ok(buscarId);
    }


}
