package br.com.recode.eurotrip_crud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.recode.eurotrip_crud.database.RepositoriesCliente;
import br.com.recode.eurotrip_crud.entidade.Cliente;

@RestController
@RequestMapping("/cliente")
public class ClienteREST {

    @Autowired
    private RepositoriesCliente repositorio;

    @GetMapping
    public List<Cliente> listar() {
        return repositorio.findAll();
    }

    @PostMapping
    public void salvar(@RequestBody Cliente cliente) {
        repositorio.save(cliente);
    }

    @PutMapping
    public void alterar(@RequestBody Cliente cliente) {
        if (cliente.getIdCliente() > 0)
            repositorio.save(cliente);
    }

    @DeleteMapping
    public void excluir(@RequestBody Cliente cliente) {
        repositorio.delete(cliente);
    }
}
