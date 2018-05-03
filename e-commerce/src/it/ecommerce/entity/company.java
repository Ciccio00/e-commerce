package it.ecommerce.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name ="company")
public class company {
          private Long id;
          private String ragionesociale;
          private String partitaiva;
          private String codicefiscale;
          private String descrizione;
          private List<item> item;
        
         @OneToMany (mappedBy = "company", cascade = CascadeType.ALL)
        public List<item> getItem() {
			return item;
		}
		public void setItem(List<item> item) {
			this.item = item;
		}
		@Id
        @Column (name = "idcompany")
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		@Column (name = "ragionesociale")
		public String getRagionesociale() {
			return ragionesociale;
		}
		public void setRagionesociale(String ragionesociale) {
			this.ragionesociale = ragionesociale;
		}
		@Column (name = "partitaiva")
		public String getPartitaiva() {
			return partitaiva;
		}
		public void setPartitaiva(String partitaiva) {
			this.partitaiva = partitaiva;
		}
		@Column (name = "codicefiscale")
		public String getCodicefiscale() {
			return codicefiscale;
		}
		public void setCodicefiscale(String codicefiscale) {
			this.codicefiscale = codicefiscale;
		}
		@Column (name = "descrizione")
		public String getDescrizione() {
			return descrizione;
		}
		public void setDescrizione(String descrizione) {
			this.descrizione = descrizione;
		}
          
}
