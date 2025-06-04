/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.penariol.garagem.service;

import br.com.penariol.garagem.DTO.VeiculoMinDTO;
import br.com.penariol.garagem.entities.Veiculo;
import br.com.penariol.garagem.repositories.GarageRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ppjatb
 */
@Service
public class GarageService {

    @Autowired
    private GarageRepository garageRepository;
    
    public List<VeiculoMinDTO> findAll(){
        List<Veiculo> resultVeiculo = garageRepository.findAll();
        
        List<VeiculoMinDTO> resultDTO = resultVeiculo.stream().map(x -> new VeiculoMinDTO(x)).toList();
        
        return resultDTO;
    }
   
    public Veiculo findById (long id) {
     Veiculo result = garageRepository.findById(id);
      return result;
    }
    
    public List<VeiculoMinDTO> findByCor(String cor){
        List<Veiculo> resultVeiculo = garageRepository.findByCorIgnoreCase(cor);
        
        List<VeiculoMinDTO> resultDTO = resultVeiculo.stream().map(x -> new VeiculoMinDTO(x)).toList();
        
        return resultDTO;
        
    }
    
    public List<VeiculoMinDTO> findByAno(int ano){
        List<Veiculo> resultVeiculo = garageRepository.findByAno(ano);
        
        List<VeiculoMinDTO> resultDTO = resultVeiculo.stream().map(x -> new VeiculoMinDTO(x)).toList();
        
        return resultDTO;
        
    }
}
