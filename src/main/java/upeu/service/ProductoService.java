package upeu.service;

import java.util.List;
import java.util.Optional;


import upeu.entity.Productos;

public interface ProductoService {
	
	Productos create(Productos a);
	Productos update(Productos a);
	void delete(Long id);
	Optional<Productos>read(Long id);
	List<Productos>readAll();
}
