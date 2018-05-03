package it.ecommerce.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity 
@Table (name ="utente")
public class User {
       private Long id;
       private String nome;
       private String cognome;
       private String username;
       private String password;
       private String country;
       private String city;
       private String address;
       private String cap;
  //     private company company;
   //    private role role;
   /*   
     @ManyToMany(cascade =  CascadeType.ALL)
     @JoinColumn(name = "idrole")
     @GeneratedValue(strategy=GenerationType.IDENTITY)
    public role getRole() {
		return role;
	}
	public void setRole(role role) {
		this.role = role;
	}
	@ManyToMany(cascade =  CascadeType.ALL)
    @JoinColumn(name = "idcompany")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public company getCompany() {
		return company;
	}
	public void setCompany(company company) {
		this.company = company;
	}
	*/
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "idutente")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name = "nome")
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Column(name = "cognome")
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	@Column(name = "username")
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Column(name = "password")
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Column(name = "country")
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Column(name = "city")
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Column(name = "address")
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Column(name = "cap")
	public String getCap() {
		return cap;
	}
	public void setCap(String cap) {
		this.cap = cap;
	}
       
}
