package it.ecommerce.business;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.ecommerce.entity.User;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/userservlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	@EJB
	UserBeanLocal localbeanUSER ;
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String vero = request.getParameter("true");
		if( vero.equals("aggiungi")) {		
		User u = new User();
		u.setNome("Luca");
		u.setCognome("Verdi");
		u.setAddress("Via Roma");
		u.setCap("100");
		u.setCity("Roma");
		u.setCountry("Italia");
		u.setUsername("LVerdi");
		u.setPassword("pwd");
		localbeanUSER.aggiungiuser(u);
		response.getWriter().append("OK").append(request.getContextPath());
	} else response.getWriter().append("NON AGGIUNTO").append(request.getContextPath());
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
