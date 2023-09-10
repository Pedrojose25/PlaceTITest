package com.pedro.demo.Controller;

import com.pedro.demo.model.Marca;
import com.pedro.demo.service.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/marca")
public class MarcaResource {

    @Autowired
    private MarcaService service;

    @GetMapping
    public ResponseEntity<List<Marca>> retornaTodosMarca(Marca marca) {
        List<Marca> listaMarca = service.retornaListaDeMarca();

        return ResponseEntity.ok(listaMarca);
    }

    @PostMapping
    public ResponseEntity<Marca> inserirMarca(@RequestBody Marca marca) {
        Marca retornoService = service.inserirMarca(marca);

        return ResponseEntity.status(HttpStatus.CREATED).body(retornoService);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> deleteMarca(@PathVariable("id") Long id) throws Exception {
        service.deleteMarca(id);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping
    public ResponseEntity<Void> deletarModeloDentroMarca(@RequestBody Marca modeloRemocao) {
        service.deleteModeloDentroMarca(modeloRemocao);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Void> atualizarMarca(@RequestBody Marca marca){
        service.atualizarMarca(marca);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @GetMapping(path = "/{id}")
    public ResponseEntity<Marca> buscarPorId(@PathVariable("id")Long id){
       Marca marcaPorId = service.buscarPorId(id);

        return ResponseEntity.ok(marcaPorId);
    }

}
