package it.ecommerce.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "role")
public class role {
           private Long id;
           private String nome;
           private String descrizione;
        
        @Id
        @Column (name = "idrole")
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
		@Column (name = "descrizione")
		public String getDescrizione() {
			return descrizione;
		}
		public void setDescrizione(String descrizione) {
			this.descrizione = descrizione;
		}
           
}
