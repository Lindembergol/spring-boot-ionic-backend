package com.ntech.software.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ntech.software.domain.Categoria;
import com.ntech.software.repositories.CategoriaRepository;
import com.ntech.software.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id){
		
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! id: " + id + 
				", Tipo: " + Categoria.class.getName()));
		
	}

}
