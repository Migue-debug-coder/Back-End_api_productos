package ies_alcores.api_productos.repository;

import ies_alcores.api_productos.model.Categoria;
import ies_alcores.api_productos.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoriaRepository extends JpaRepository<Categoria, String> {
    Optional<Categoria> findById(long id);
}
