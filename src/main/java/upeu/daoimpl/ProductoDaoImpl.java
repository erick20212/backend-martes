package upeu.daoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import upeu.dao.ProductoDao;
import upeu.entity.Productos;
import upeu.repository.ProductoRepository;

@Component
public class ProductoDaoImpl implements ProductoDao{
	
	@Autowired
	private ProductoRepository productoRepository;
	@Override
	public Productos create(Productos a) {
		// TODO Auto-generated method stub
		return productoRepository.save(a);
	}

	@Override
	public Productos update(Productos a) {
		// TODO Auto-generated method stub
		return productoRepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		productoRepository.deleteById(id);
		
	}

	@Override
	public Optional<Productos> read(Long id) {
		// TODO Auto-generated method stub
		return productoRepository.findById(id);
	}

	@Override
	public List<Productos> readAll() {
		// TODO Auto-generated method stub
		return productoRepository.findAll();
	}

}
