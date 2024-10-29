package upeu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import upeu.entity.Productos;

@Repository
public interface ProductoRepository extends JpaRepository<Productos, Long>{

}
