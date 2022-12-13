package com.example.edsoncabrejos.service;

import java.util.List;

import com.example.edsoncabrejos.dto.TuristaDTO;

public interface TuristaService {
	
	List<TuristaDTO> lista();
	void guardar(TuristaDTO turista);
}
