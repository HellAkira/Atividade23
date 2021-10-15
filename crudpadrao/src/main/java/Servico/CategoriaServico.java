package Servico;

import java.util.Date;
import java.util.List;

import Dominio.Categoria;
import repositorio.CategoriaRepositorio;

public class CategoriaServico extends BaseServico {

	private CategoriaRepositorio repo;

	public CategoriaServico(CategoriaRepositorio repo) {
			
		this.repo = repo;

	}

	public void alterar(Categoria cat) {
		
		repo.update(cat);
		
	}

	public void excluir(Categoria cat) {
		
		repo.delete(cat.getCategoriaID());
		
	}

	public void excluirPorID(int id) {
		repo.delete(id);
	}
	
	public void inserir(int id) {
		
		Categoria c = new Categoria(id, "teste", new Date());
		repo.create(c);
		
	}

	public List<Categoria> listar() {
		
		return repo.readAll();
		
	}

	public Categoria obter(int id) {

		return repo.read(id);

	}

}
