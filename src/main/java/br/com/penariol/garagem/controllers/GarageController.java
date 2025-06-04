/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.penariol.garagem.controllers;

import br.com.penariol.garagem.DTO.VeiculoMinDTO;
import br.com.penariol.garagem.entities.Veiculo;
import br.com.penariol.garagem.service.GarageService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ppjatb
 */
@RestController
public class GarageController {
    @Autowired
    private GarageService garageService;
    
    @GetMapping ("/forsale")
    public ResponseEntity<List<VeiculoMinDTO>> findAll(){
        List<VeiculoMinDTO> result = garageService.findAll();
        if(result.isEmpty()){
            return ResponseEntity.notFound().build();
        }else{
            return ResponseEntity.ok(result);
        }  
    }
    
    @GetMapping ("/id/{id}")
    public ResponseEntity<Veiculo> findById(@PathVariable long id){
      Veiculo result = garageService.findById(id);
      
       if (result == null){
            return ResponseEntity.notFound().build();
        }
        else{
            return ResponseEntity.ok(result);
        } 
    }
    
     @GetMapping("/cor/{cor}")
     public ResponseEntity<List<VeiculoMinDTO>> findByCorIgnoreCase(@PathVariable String cor){
     
        List<VeiculoMinDTO> result = garageService.findByCor(cor);
        if(result.isEmpty()){
            return ResponseEntity.notFound().build();
        }else{
            return ResponseEntity.ok(result);
        }
    }
    
      @GetMapping("/ano/{ano}")
     public ResponseEntity<List<VeiculoMinDTO>> findByAnoIgnoreCase(@PathVariable int ano){
     
        List<VeiculoMinDTO> result = garageService.findByAno(ano);
        if(result.isEmpty()){
            return ResponseEntity.notFound().build();
        }else{
            return ResponseEntity.ok(result);
        }
    }
    
}
