package it.ecommerce.business;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.websocket.server.PathParam;

import it.ecommerce.entity.User;

@Stateless
@LocalBean
public class UserBean implements UserBeanLocal {
	@PersistenceContext(unitName="webPersistence")
	 EntityManager m;
	public UserBean() {
		
	}
	public void aggiungiuser (User u) {
		m.persist(u);
	}
	
	public void aggiornauser (Long id) {
		User u= getUserID(id);
		 m.merge(u);
	}
	public void cancellauser (Long id ) {
		 User u =  getUserID(id);
		 m.remove(u);
	}
	public User getUserID(@PathParam("iduser")Long id) {
		return m.find(User.class, id);
	}
	public List<User>  cercautente(){
		return m.createQuery("SELECT u FROM User u").getResultList();
	}
}
