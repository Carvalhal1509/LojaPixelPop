package sucess.lojavanessadev.PixelPop.model;

import java.io.Serializable;

import jakarta.persistence.*;


@Entity
@Table(name = "Produto")
public class Produto implements Serializable {

	public Produto() {
		super();
	}

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	public String nome;
	public String imagem;
	private Double valorVenda;
	private Double quantidadeEstoque=0.;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getImagem() {
		return imagem;
	}
	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	
	public Double getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(Double valorVenda) {
		this.valorVenda = valorVenda;
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(Double quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
	

	@Override
	public String toString() {
		return "Product [id=" + id + ", nome=" + nome + ", valorVenda=" + valorVenda + ", imagem=" + imagem
				+ "]";
	}
	
}
