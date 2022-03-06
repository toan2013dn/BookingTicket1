
package control;

import entity.account;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "UserVerifyControl", urlPatterns = {"/userverifyControl"})
public class userverifyControl extends HttpServlet {

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
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
          
        String code  = (String) request.getSession().getAttribute("codeCheck"); 
        String codeCheck = request.getParameter("code");
        if (code.trim().equals(codeCheck.trim())) {
            request.getSession().removeAttribute("code");
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }   else{
            request.setAttribute("mess", "No match, please re-enter");
            request.getRequestDispatcher("verify.jsp").forward(request, response);
        }
        }
           
           
    }
    

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */

}
