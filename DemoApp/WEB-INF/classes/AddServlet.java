import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class AddServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        // Get numbers from request parameters
        int i = Integer.parseInt(req.getParameter("num1"));
        int j = Integer.parseInt(req.getParameter("num2"));

        // Perform addition and then square the result
        int k = i + j;
        k = k * k;

        // Set the result as a request attribute
        req.setAttribute("result", k);

        // Forward the request to SqServlet
        RequestDispatcher rd = req.getRequestDispatcher("/sq");
        rd.forward(req, res);
    }
}
