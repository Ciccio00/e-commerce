package it.ecommerce.business;

import java.util.List;
import it.ecommerce.entity.User;

public interface UserBeanLocal {
            public void aggiungiuser(User u);
            public void aggiornauser (Long id);
        	public void cancellauser (Long id );
        	public User getUserID(Long id);
        	public List<User> cercautente();
}
