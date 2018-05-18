/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import metier.Administrateur;
import metier.Etudiant;
import metier.GestionUser;
import metier.User;

/**
 *
 * @author HP
 */
public class Servletauthentiff extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Servletauthentiff</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Servletauthentiff at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
      
      
        try {
            res.setContentType("text/html");
            PrintWriter out = res.getWriter();
            //recuperation des valeurs des champs dans la form auth.jsp
            String log = req.getParameter("log");
            String pass = req.getParameter("pass");
            String type = req.getParameter("type");
            User k=null;
            GestionUser u= new GestionUser();
            //la methode authentifier retourne un objet de type user
            k= u.authentifier(log, pass, type);
            //creation de la nv session
             HttpSession session = req.getSession(true);
          // selon le type de l objet user on va faire le forward vers la jsp correspondante
             if(k.getType().equalsIgnoreCase("Administrateur"))
            {Administrateur a =(Administrateur)k;
                session.setAttribute( "admin",a );
                  this.getServletContext().getRequestDispatcher("/BienAdmin.jsp").forward( req, res);
            } 
            
                 if(k.getType().equalsIgnoreCase("Etudiant"))
            {Etudiant e =(Etudiant)k;
                
                session.setAttribute( "etud", e);
            this.getServletContext().getRequestDispatcher("/BienEtud.jsp").forward( req, res);
            }
             else {
             
              this.getServletContext().getRequestDispatcher("/authentification2.jsp").forward( req, res);
             }
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(Servletauthentiff.class.getName()).log(Level.SEVERE, null, ex);
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
