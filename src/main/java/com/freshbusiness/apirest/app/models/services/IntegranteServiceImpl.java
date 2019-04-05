package com.freshbusiness.apirest.app.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.freshbusiness.apirest.app.models.dao.IIntegranteDao;
import com.freshbusiness.apirest.app.models.entity.Integrante;

@Service
public class IntegranteServiceImpl implements IIntegranteService{

	@Autowired
	private IIntegranteDao integranteDao;
	
	@Override
	public List<Integrante> findAll() {
		return (List<Integrante>) integranteDao.findAll();
	}

}
