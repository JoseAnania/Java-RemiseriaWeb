package Servlets;

import Controlador.Conexion;
import Modelo.Cierre;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletCargaCierre extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            Conexion C=new Conexion();
            ArrayList lista=C.comboChofer();
            request.setAttribute("lista", lista);
            ArrayList lista2=C.comboAuto();
            request.setAttribute("lista2", lista2);
            
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/cargaCierre.jsp");
            rd.forward(request,response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String idChofer=request.getParameter("cboChofer");
        String idAuto=request.getParameter("cboAuto");
        String viajes=request.getParameter("viajes");
        String facturacion=request.getParameter("facturacion");
        
        Cierre C=new Cierre();
        
        C.setIdChofer(Integer.parseInt(idChofer));
        C.setIdAuto(Integer.parseInt(idAuto));
        C.setViajes(Integer.parseInt(viajes));
        C.setFacturacion(Float.parseFloat(facturacion));
        
        Conexion Con=new Conexion();
        
        Con.agregarCierre(C);
        
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Remisería</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<li><a href=\"index.html\">Volver</a></li>");
            out.println("<h1>Se cargo el Cierre exitosamente</h1>");
            out.println("</body>");
            out.println("</html>");
    }
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
