package model.service;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.Produto;

public class ProdutoService {

	@Inject
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	public List<Produto> findByName(String nome){
		Query query = entityManager.createQuery("SELECT p FROM Produto p WHERE p.nome LIKE CONCAT(:nome, '%')");
		query.setParameter("nome", nome);
		
		return query.getResultList();
	}
}
