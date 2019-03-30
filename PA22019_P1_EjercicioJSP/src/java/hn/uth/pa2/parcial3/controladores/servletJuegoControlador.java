/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.pa2.parcial3.controladores;

import hn.uth.pa2.parcial3.util.util;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author eliucinho
 */
@WebServlet(name = "servletJuegoControlador", urlPatterns = {"/servletJuegoControlador"})
public class servletJuegoControlador extends HttpServlet {

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
        int noExito=Integer.parseInt(request.getSession().getAttribute("noExito").toString());
        int noError=Integer.parseInt(request.getSession().getAttribute("noError").toString());
        int noIntento=Integer.parseInt(request.getSession().getAttribute("noIntento").toString());
        
        int valorAleatorioA=util.getAleatorio();
        int valorAleatorioB=util.getAleatorio();
        int posicionSigno=util.getPosicionSigno();
        int resultadoFormula=util.calcular(valorAleatorioA, valorAleatorioB, posicionSigno);
        
        String fraseFormula=valorAleatorioA+util.getSigno(posicionSigno)+valorAleatorioB;
        String fraseExito="";
        String fraseError="";
        
        if (noIntento>0) {
            String fraseFormulaAlmacenada=request.getSession().getAttribute("fraseFormula").toString();
            int respuestaUsuario=Integer.parseInt(request.getParameter("respuestaUsuario").toString());;
            int resultadoFormulaAlmacenada=Integer.parseInt(request.getSession().getAttribute("resultadoFormula").toString());
            
            if (respuestaUsuario==resultadoFormulaAlmacenada) {
                noExito++;
                fraseExito="Respuesta correcta: "+fraseFormulaAlmacenada+"="+resultadoFormulaAlmacenada;
            }else{
                noError++;
                fraseError="Respuesta erronea: "+fraseFormulaAlmacenada+"="+resultadoFormulaAlmacenada;
            }
            noIntento++;
        }
       
        if (noIntento==0) {
            noIntento++;
        }
        
        request.getSession().setAttribute("noExito", noExito);
        request.getSession().setAttribute("noError", noError);
        request.getSession().setAttribute("noIntento", noIntento);
        request.getSession().setAttribute("resultadoFormula", resultadoFormula);
        request.getSession().setAttribute("fraseFormula", fraseFormula);
        request.getSession().setAttribute("fraseExito", fraseExito);
        request.getSession().setAttribute("fraseError", fraseError);
              
        
        response.sendRedirect("paginas/frmJuego.jsp");
        /*response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {           
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet servletJuegoControlador</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet servletJuegoControlador at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }*/
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
