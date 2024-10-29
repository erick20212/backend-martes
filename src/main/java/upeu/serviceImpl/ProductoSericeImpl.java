package upeu.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.dao.ProductoDao;
import upeu.entity.Productos;
import upeu.service.ProductoService;

@Service
public class ProductoSericeImpl implements ProductoService{
	
	@Autowired
	private ProductoDao dao;
	@Override
	public Productos create(Productos a) {
		// TODO Auto-generated method stub
		return dao.create(a);
	}

	@Override
	public Productos update(Productos a) {
		// TODO Auto-generated method stub
		return dao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
		
	}

	@Override
	public Optional<Productos> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Productos> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
