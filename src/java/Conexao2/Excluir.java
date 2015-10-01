/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexao2;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author info206
 */
@WebServlet(name = "Excluir", urlPatterns = {"/Excluir"})
public class Excluir extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        String connectionURL = "jdbc:mysql://127.0.0.1/test";
        String User = "root";
        String Pass = "123456";


        String Titulo = request.getParameter("Titulo ");
        String Autor = request.getParameter("Autor");
        String genero = request.getParameter("genero");


        Connection connection = null;
        Statement statement = null;


        Class.forName("com.mysql.jdbc.Driver");

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {


            String query = "DELETE FROM livros WHERE Titulo = ?, Autor = ?, genero = ?";



            PreparedStatement stmt = connection.prepareStatement("delete from livros where nome = (?), endereco = (?), cpf = (?)");

            stmt.setString(1, Titulo);
            stmt.setString(2, Autor);
            stmt.setString(3, genero);
            stmt.executeUpdate();



        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Excluir.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Excluir.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Excluir.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Excluir.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
