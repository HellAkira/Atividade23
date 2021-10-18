package Dominio;

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CategoriaID")
	private Integer categoriaID;

	@Column(name = "Descricao")
	private String descricao;

	@Column(name = "DataInsert")
	private Date dataDeInsercao;

	public Integer getCategoriaID() {
		return categoriaID;
	}

	public void setCategoriaID(Integer categoriaID) {
		this.categoriaID = categoriaID;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataDeInsercao() {
		return dataDeInsercao;
	}

	public void setDataDeInsercao(Date dataDeInsercao) {
		this.dataDeInsercao = dataDeInsercao;
	}

	public Categoria() {

	}

	public Categoria(Integer categoriaID, String descricao, Date dataDeInsercao) {
		super();
		this.categoriaID = categoriaID;
		this.descricao = descricao;
		this.dataDeInsercao = dataDeInsercao;
	}

	@Override
	public String toString() {
		return "Categoria [categoriaID=" + categoriaID + ", descricao=" + descricao + ", dataDeInsercao="
				+ dataDeInsercao + "]";
	}

}