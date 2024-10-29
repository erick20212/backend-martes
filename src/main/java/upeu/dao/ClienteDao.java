package upeu.dao;

import java.util.List;
import java.util.Optional;

import upeu.entity.Clientes;

public interface ClienteDao {
	Clientes create(Clientes a);
	Clientes update(Clientes a);
	void delete(Long id);
	Optional<Clientes>read(Long id);
	List<Clientes>readAll();
}
