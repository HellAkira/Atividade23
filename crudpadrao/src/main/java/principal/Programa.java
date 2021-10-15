package principal;

import Dominio.SubCategoria;
import Servico.SubCategoriaServico;
import repositorio.SubCategoriaRepositorio;

public class Programa {

	public static void main(String[] args) {
		SubCategoriaRepositorio repo = new SubCategoriaRepositorio("exemplo-jpa");
		SubCategoriaServico serv = new SubCategoriaServico(repo);
		
		for (SubCategoria item : serv.listar())
		{
			System.out.println(item);
			
			
		}
		
		repo.dispose();
		
		
	}
	
}
