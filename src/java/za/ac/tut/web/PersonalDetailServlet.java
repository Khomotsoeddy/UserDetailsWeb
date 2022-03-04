/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.personaldetails.PersonalDetails;
import za.ac.tut.personaldetailsprocessor.PersonalDetailsProcessor;

/**
 *
 * @author user
 */
public class PersonalDetailServlet extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String DoB = request.getParameter("dateOB");
        
        PersonalDetails pd = new PersonalDetails(firstName,lastName,email,DoB);
        PersonalDetailsProcessor pdp = new PersonalDetailsProcessor();
        String outcome = pdp.calculateAge(pd);
        
        request.setAttribute("firstName", firstName);
        request.setAttribute("lastName", lastName);
        request.setAttribute("email", email);
        request.setAttribute("DoB", DoB);
        request.setAttribute("outcome", outcome);
        
        
        RequestDispatcher disp = request.getRequestDispatcher("detalis.jsp");
        disp.forward(request, response);
    }
}
