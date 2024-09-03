/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author PC
 */
@WebServlet(name="LoginServlet", urlPatterns={"/login"})
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter print = response.getWriter();
        
        
        String e = "nghiemxuanloc02@gmail.com";
        String p = "12345678";
        
        
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        
        if(e.equalsIgnoreCase(email) && p.equals(password)){
            request.setAttribute("success", "Dang nhap thanh cong");
        }else{
            request.setAttribute("error", "Dang nhap that bai");
        }
        
        request.getRequestDispatcher("Home.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter print = response.getWriter();
        
        
        String e = "nghiemxuanloc02@gmail.com";
        String p = "12345678";
        
        
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        
        if(e.equalsIgnoreCase(email) && p.equals(password)){
            request.setAttribute("success", "Dang nhap thanh cong");
        }else{
            request.setAttribute("error", "Dang nhap that bai");
        }
        
        request.getRequestDispatcher("Home.jsp").forward(request, response);
    }
   
    
}
