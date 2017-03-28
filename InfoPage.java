

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InfoPage
 */
@WebServlet("/InfoPage")
public class InfoPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InfoPage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String names = "massy nahid hasan ali javad zahra";//online names got from server   request.getParameter("");
		String [] name = names.split(" ");
		String a = "";
	/*	for (String string : name) {
			//a = a + "<li class='list-group-item'>" + string + "</li>";
			a = a + "<option value="+string+">" + string + "</option>";
		}*/
		
		Cookie [] c  = request.getCookies();
		for(Cookie cook : c){
			a = a + "<option value="+cook.getName()+">" + cook.getName() + "</option>";
		}
		
	/*	
		String infopage = "<html>"
				+ "<head>"
				+ "<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css' integrity='sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u' crossorigin='anonymous'>"
				+ "</head><body><br><br><div class='container'><div class='col-md-3 col-md-offset-4'>  "
				+ " <form action='/finalproject/InfoProcess.jsp' method='GET'><ul class='list-group'>"+ a +" </ul> "
						+ "<div class='input-group'><input type='text' name='selectedName' class='form-control' placeholder='Pick a name' aria-describedby='basic-addon1'></div>"
						+ "<button type='submit' class='btn btn-info'>Start chat</button> </form>	</div></div></body></html>";*/
		
		String infopage = "<html>"
				+ "<head>"
				+ "<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css' integrity='sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u' crossorigin='anonymous'>"
				+ "</head><body><br><br><div class='container'><div class='col-md-3 col-md-offset-4'>  "
				+ " <form action='/finalproject/InfoProcess.jsp' method='GET'><select multiple class='selectpicker' data-live-search='true' name='slct'>"+ a +" </select> "
						+ "<div class='input-group'></div>"
						+ "<button type='submit' class='btn btn-info'>Start chat</button> </form>	</div></div></body></html>";
		
		response.getWriter().append(infopage).append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
