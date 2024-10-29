package upeu.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.dao.ClienteDao;
import upeu.entity.Clientes;
import upeu.service.ClienteService;

@Service
public class CLienteServiceImpl implements ClienteService{

	@Autowired
	private ClienteDao dao;
	@Override
	public Clientes create(Clientes a) {
		// TODO Auto-generated method stub
		return dao.create(a);
	}

	@Override
	public Clientes update(Clientes a) {
		// TODO Auto-generated method stub
		return dao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
		
	}

	@Override
	public Optional<Clientes> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Clientes> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
