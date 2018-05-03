package it.ecommerce.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "item")
public class item {
      private Long id;
      private String nome;
      private company company;
      
    @Id
    @Column (name = "idtem")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Column (name = "nome")
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	@ManyToOne
	@JoinColumn(name = "idcompany")
	public company getIdcompany() {
		return company;
	}
	public void setIdcompany(company company) {
		this.company = company;
	}
	
}
