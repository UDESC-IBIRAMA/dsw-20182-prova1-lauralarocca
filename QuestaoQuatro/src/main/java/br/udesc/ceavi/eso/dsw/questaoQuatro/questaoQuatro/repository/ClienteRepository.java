/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ceavi.eso.dsw.questaoQuatro.questaoQuatro.repository;

import br.udesc.ceavi.eso.dsw.questaoQuatro.questaoQuatro.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author laura
 */
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
