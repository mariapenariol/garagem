/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.penariol.garagem.repositories;

import br.com.penariol.garagem.entities.Veiculo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ppjatb
 */
public interface GarageRepository extends JpaRepository<Veiculo, Long>{
    
    Veiculo findById(long id);
    List<Veiculo> findByCorIgnoreCase(String cor);
}
