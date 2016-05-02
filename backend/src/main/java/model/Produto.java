package model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Produto implements Serializable {

	private static final long serialVersionUID = 5070612565280670999L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column
	private String nome;
	@Temporal(TemporalType.DATE)
	@Column
	private Date dataAnuncio;
	@Column
	private Double valor;

	public Produto() {
		
	}

	public Produto(String nome, Date dataAnuncio, Double valor) {
		super();
		this.nome = nome;
		this.dataAnuncio = dataAnuncio;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataAnuncio() {
		return dataAnuncio;
	}

	protected void setDataAnuncio(Date dataAnuncio) {
		this.dataAnuncio = dataAnuncio;
	}
	
	public Double getValor() {
		return this.valor;
	}
	
	protected void setValor(Double valor) {
		this.valor = valor;
	}

}
