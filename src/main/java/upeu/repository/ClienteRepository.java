package upeu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import upeu.entity.Clientes;

@Repository
public interface ClienteRepository extends JpaRepository<Clientes, Long>{

}
