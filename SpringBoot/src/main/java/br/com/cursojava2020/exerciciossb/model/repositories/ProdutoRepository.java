package br.com.cursojava2020.exerciciossb.model.repositories;

import br.com.cursojava2020.exerciciossb.model.entities.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {


}
