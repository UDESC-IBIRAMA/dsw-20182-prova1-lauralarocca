/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ceavi.eso.dsw.questaoQuatro.questaoQuatro.resource;

import br.udesc.ceavi.eso.dsw.questaoQuatro.questaoQuatro.model.Cliente;
import br.udesc.ceavi.eso.dsw.questaoQuatro.questaoQuatro.repository.ClienteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author laura Questão 4
 */
@RestController
@RequestMapping("/cliente")
public class ClienteResource {

    @Autowired
    private ClienteRepository cr;

    //A e B(Persistido através do Spring)
    @PostMapping
    public void salvar(@RequestBody Cliente cliente) {
        cr.save(cliente);
    }

    //C
    @GetMapping
    public List<Cliente> clientes() {
        return cr.findAll();
    }

    //D
    @PutMapping(consumes = "application/json")
    public void update(@RequestParam Long id) {

    }

}
