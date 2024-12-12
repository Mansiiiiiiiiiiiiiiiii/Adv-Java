import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class SqServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        // Retrieve the result attribute from the request
        int result = (Integer) req.getAttribute("result");

        // Send the result to the client
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<html><body>");
        out.println("<h1>Squared Result: " + result + "</h1>");
        out.println("</body></html>");
    }
}
