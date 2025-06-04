/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.penariol.garagem.service;

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
    private GarageRepository garegeRepository;
    
    public List<Veiculo> findAll(){
        List<Veiculo> result = garegeRepository.findAll();
        return result;
    }
   
}
