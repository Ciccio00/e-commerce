 package it.ecommerce.business;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.websocket.server.PathParam;

import it.ecommerce.entity.User;



@Stateless

public class UserBean implements UserBeanLocal {
	@PersistenceContext(unitName = "e_commerce")
	 EntityManager m;
	public UserBean() {
		
	}
	public void aggiungiuser (User u) {
		m.persist(u);
	}
} 
