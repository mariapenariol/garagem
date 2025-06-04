/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.penariol.garagem.controllers;

import br.com.penariol.garagem.entities.Veiculo;
import br.com.penariol.garagem.service.GarageService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
    public List<Veiculo> findAll(){
        List<Veiculo> result = garageService.findAll();
        return result;
    }
}
