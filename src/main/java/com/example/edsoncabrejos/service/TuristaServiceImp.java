package com.example.edsoncabrejos.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.edsoncabrejos.dto.TuristaDTO;
import com.example.edsoncabrejos.model.Turista;
import com.example.edsoncabrejos.repository.TuristaRepository;

@Service
public class TuristaServiceImp implements TuristaService {

	
	@Autowired
	private TuristaRepository repository;
	@Override
	public List<TuristaDTO> lista() {
		List<TuristaDTO> listadto = new ArrayList<>();
		TuristaDTO dto = null;
				
		for (Turista hospedaje : repository.findAll()) {
			dto = new TuristaDTO();
			dto.setNom(hospedaje.getNombre());
			dto.setCod(hospedaje.getIdTurista());
			listadto.add(dto);
		}
		
	
		return listadto;
	}

	@Override
	public void guardar(TuristaDTO turista) {
		Turista hos = new Turista();
		hos.setNombre(turista.getNom());
		hos.setIdTurista(turista.getCod());
		
		repository.save(hos);
	}

}
