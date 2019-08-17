package me.aboullaite.bookstore.controller;

import me.aboullaite.bookstore.repository.DemobookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import me.aboullaite.bookstore.model.Libros;
import me.aboullaite.bookstore.repository.LibrosInt;
import org.springframework.web.bind.annotation.PathVariable;
@RestController
@RequestMapping("/libros")
public class BookController {

    @Autowired
    DemobookRepository repositorio;
    
    @Autowired
    LibrosInt librosInt;
   
    @GetMapping("todos")
    public ResponseEntity<List<Libros>> getAllDemoBooks(){
        return ResponseEntity.ok((List)repositorio.findAll());
    }
    
    @GetMapping("uno/{name}")
    public ResponseEntity<Libros> porNombre(@PathVariable String name){
        return ResponseEntity.ok(librosInt.findLibroByName(name));
    }
    
    
    @GetMapping("hello")
    public String hi(){
        return "Prueba";
    }

}
