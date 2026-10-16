package br.com.senai.infoa.backend.projeto_empreendedor.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.infoa.backend.projeto_empreendedor.models.Empreendedor;
import br.com.senai.infoa.backend.projeto_empreendedor.services.EmpreendedorService;


@RestController 
@RequestMapping("/empreendedor")
public class EmpreendedorController {
    @Autowired 
    private EmpreendedorService empreendedorService;

    @GetMapping("/contar")
    public Long contar() {
        return empreendedorService.contar();
    }

    @GetMapping("/listar")
    public List<Empreendedor> listar() {
        return empreendedorService.listar();
    }

    @GetMapping("/buscar/{id}")
    public Empreendedor buscarPorId(@PathVariable  Integer id) {
        return empreendedorService.buscarPorId(id);
    }

    public EmpreendedorController(EmpreendedorService empreendedorService) {
        this.empreendedorService = empreendedorService;
    }
    //o controller é responsável por receber as requisições do usuário e repassar para o service, que por sua vez repassa para o repository, que acessa o banco de dados.
    //ele usa o @RestController para indicar que é um controller e o @RequestMapping para indicar o caminho da requisição. O @GetMapping indica que é uma requisição do tipo GET.
    //e use a sintaxe do @GetMapping para o Swagger conseguir executar o método
}





