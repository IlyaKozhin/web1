package servlets;

import util.PageGenerator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MultServlet extends HttpServlet {

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response) throws ServletException, IOException {
        String value = request.getParameter("value");
        int foo;
        response.setStatus(HttpServletResponse.SC_OK);
        try {
            foo = Integer.parseInt(value);
        } catch (NumberFormatException e) {
            foo = 0;
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        }
        response.getWriter().println(((Integer) (2 * foo)).toString());
        response.setContentType("text/html;charset=utf-8");
    }
}
