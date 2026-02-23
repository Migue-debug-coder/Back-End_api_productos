package ies_alcores.api_productos.repository;

import ies_alcores.api_productos.model.Categoria;
import ies_alcores.api_productos.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

    @Query("select c from Categoria c where c.id between 1 and 5")
    List<Categoria> findIdBetween1and5;

}
