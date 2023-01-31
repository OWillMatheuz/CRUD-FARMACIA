package org.generation.farmaciadagen.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name="tb_categoria")
public class CategoriaFarma {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O atributo Tipo de Categoria é Obrigátorio!")
	@Size(min = 10, max = 100, message ="O atributo Tipo de Categoria deve conter no mínimo 100 e no máximo 100 caracteres")
	private String categoriaProduto;
	
	@NotBlank(message = "O atributo Generico ou Original é Obrigátorio!")
	@Size(min = 10, max = 100, message ="O atributo Generico ou Original deve conter no mínimo 100 e no máximo 100 caracteres")
	private String genericoOriginal;
	
	@OneToMany(mappedBy = "categorias", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("categorias")
	private List<ProdutoFarma> produtos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategoriaProduto() {
		return categoriaProduto;
	}

	public void setCategoriaProduto(String categoriaProduto) {
		this.categoriaProduto = categoriaProduto;
	}

	public String getGenericoOriginal() {
		return genericoOriginal;
	}

	public void setGenericoOriginal(String genericoOriginal) {
		this.genericoOriginal = genericoOriginal;
	}

	public List<ProdutoFarma> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<ProdutoFarma> produtos) {
		this.produtos = produtos;
	}
	

	
	
	
	
}
