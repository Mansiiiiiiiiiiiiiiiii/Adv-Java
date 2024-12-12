import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Set content type for the response
        response.setContentType("text/html");

        // Get the PrintWriter object to send output to the client
        PrintWriter out = response.getWriter();
        
        try {
            // Division by zero - this will throw an ArithmeticException
            int k = 9 / 0;
        } catch (ArithmeticException e) {
            // Handle the exception and display a friendly message
            out.println("<h3>Error: Cannot divide by zero!</h3>");
        }

        // Get ServletConfig to retrieve initialization parameters
        ServletConfig config = getServletConfig();
        String str = config.getInitParameter("name");
        
        // Print the initialization parameter value if available
        if (str != null) {
            out.println("<p>Servlet Init Parameter 'name': " + str + "</p>");
        } else {
            out.println("<p>No initialization parameter 'name' found!</p>");
        }
    }
}
