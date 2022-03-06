/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.SendMail;
import dao.accountDAO;
import entity.account;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Hi
 */
@WebServlet(name = "signupControl", urlPatterns = {"/signup"})
public class signupControl extends HttpServlet {

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
            throws ServletException, IOException, Exception {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String email=request.getParameter("email");
        String pass=request.getParameter("psw");
        String firstname=request.getParameter("firstname");
        String lastname=request.getParameter("lastname");
        String phoneno=request.getParameter("phoneno");
        String re_pass=request.getParameter("re_psw");
        
        if (!pass.equals(re_pass)) {
            response.sendRedirect("Signup.jsp");
            
        } else {
            accountDAO adao=new accountDAO();
            account a=adao.checkAccountExist(email);
            
            if (a==null) {
                SendMail sm=new SendMail();
                String code = sm.getRandom();
                request.setAttribute("email", email);
                request.getSession().setAttribute("codeCheck", code);
                request.getRequestDispatcher("verify.jsp").forward(request, response);
                try {
                    sm.sendText(email, code);
                } catch (MessagingException ex) {
                    Logger.getLogger(signupControl.class.getName()).log(Level.SEVERE, null, ex);
                }
                adao.Register(email,firstname,lastname,pass,phoneno);
            
           } else {
                request.setAttribute("mess", "Username existed please try again");
                request.getRequestDispatcher("Signup.jsp").forward(request, response);
              }  
        }
    }

//    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
//    /**
//     * Handles the HTTP <code>GET</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(signupControl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//
//    /**
//     * Handles the HTTP <code>POST</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            
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
