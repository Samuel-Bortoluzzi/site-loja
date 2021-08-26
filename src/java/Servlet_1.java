/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author vinicius
 */
public class Servlet_1 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String usuario;
        String senha;
        usuario = (String) request.getParameter("user");
        senha = (String) request.getParameter("password");
        if (usuario.equals("user") && senha.equals("password")) {
            response.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = response.getWriter()) {
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Bem Vindo</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Bem Vindo ao Site do Exemplo</h1>");
                out.println("</body>");
                out.println("</html>");
            }
        } else {
            response.sendRedirect("http://www.google.com/");
        }
    }
}

