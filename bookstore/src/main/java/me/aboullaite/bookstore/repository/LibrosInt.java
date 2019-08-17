package me.aboullaite.bookstore.repository;

import me.aboullaite.bookstore.model.Libros;
import org.springframework.data.repository.Repository;


public interface LibrosInt extends Repository<Libros, Integer> {
    Libros findLibroByName(String name);
}
