package com.springdatajpa.myProjectSpringDatajpa.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springdatajpa.myProjectSpringDatajpa.models.dao.IClienteDao;
import com.springdatajpa.myProjectSpringDatajpa.models.entity.Cliente;

@Service
public class ClienteServiceImpl implements IClienteService{

	@Autowired
	private IClienteDao clienteDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return clienteDao.findAll();
	}

	@Override
	@Transactional
	public void save(Cliente cliente) {
		clienteDao.save(cliente);
	}

	@Override
	@Transactional(readOnly = true)
	public Cliente findOne(Long id) {
		// TODO Auto-generated method stub
		return clienteDao.findOne(id);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		clienteDao.delete(id);
	}
	
}
