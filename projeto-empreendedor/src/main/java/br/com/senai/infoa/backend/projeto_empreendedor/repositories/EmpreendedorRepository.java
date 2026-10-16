package br.com.senai.infoa.backend.projeto_empreendedor.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senai.infoa.backend.projeto_empreendedor.models.Empreendedor;

public interface EmpreendedorRepository extends JpaRepository<Empreendedor, Integer> {
    
}
//crie os repositories dando o nome dos arquivos de "NomeDaColunaRepository.java"
//em seguida importe a biblioteca do jpa e a coluna (nesse caso Empreendedor.java) e coloque a sintaxe correta em destaque