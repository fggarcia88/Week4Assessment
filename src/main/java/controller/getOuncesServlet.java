package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.OuncesToPounds;

/**
 * Servlet implementation class getOuncesServlet
 */
@WebServlet("/getOuncesServlet")
public class getOuncesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getOuncesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userOunces = request.getParameter("userOunces");
		
		OuncesToPounds userOuncesToPounds = new OuncesToPounds(Integer.parseInt(userOunces));
		
		request.setAttribute("userOuncesPounds", userOuncesToPounds);
		
		getServletContext().getRequestDispatcher("/ouncestopoundsresult.jsp").forward(request, response);
	}

}
