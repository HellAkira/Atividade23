package Servico;

	import java.util.Date;
	import java.util.List;

	import Dominio.SubCategoria;
	import repositorio.SubCategoriaRepositorio;
	
	public class SubCategoriaServico {

		private SubCategoriaRepositorio repo;

		public SubCategoriaServico(SubCategoriaRepositorio repo) {
				
			this.repo = repo;

		}

		public void alterar(SubCategoria cat) {
			
			repo.update(cat);
			
		}

		public void excluir(SubCategoria cat) {
			
			repo.delete(cat.getSubCategoriaID());
			
		}

		public void excluirPorID(int id) {
			repo.delete(id);
		}
		
		public void inserir(int id) {
			
			SubCategoria c = new SubCategoria(id, "teste", new Date());
			repo.create(c);
			
		}

		public List<SubCategoria> listar() {
			
			return repo.readAll();
			
		}

		public SubCategoria obter(int id) {

			return repo.read(id);

		}

	}


