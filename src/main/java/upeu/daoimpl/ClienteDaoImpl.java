package upeu.daoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import upeu.dao.ClienteDao;
import upeu.entity.Clientes;
import upeu.repository.ClienteRepository;

@Component
public class ClienteDaoImpl implements ClienteDao{
	
	@Autowired
	private ClienteRepository clienteRepository;
	@Override
	public Clientes create(Clientes a) {
		// TODO Auto-generated method stub
		return clienteRepository.save(a);
	}

	@Override
	public Clientes update(Clientes a) {
		// TODO Auto-generated method stub
		return clienteRepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		clienteRepository.deleteById(id);
		
	}

	@Override
	public Optional<Clientes> read(Long id) {
		// TODO Auto-generated method stub
		return clienteRepository.findById(id);
	}

	@Override
	public List<Clientes> readAll() {
		// TODO Auto-generated method stub
		return clienteRepository.findAll();
	}

}
