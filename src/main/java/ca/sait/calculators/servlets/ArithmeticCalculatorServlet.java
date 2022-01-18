package ca.sait.calculators.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * Calculates two Values
 * @author Earl Gerard Grande
 */
public class ArithmeticCalculatorServlet extends HttpServlet {


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
        getServletContext().getRequestDispatcher("/WEB-INF/ArithmeticCalculator.jsp").forward(request, response);
        
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
        

        String firstInput = request.getParameter("num1");
        String secondInput = request.getParameter("num2");
        String button = request.getParameter("submitButton");
        
        try{
        if(firstInput != null && secondInput != null){
        
            if("+".equals(button)){
                int firstNum = Integer.parseInt(firstInput);
                int secondNum = Integer.parseInt(secondInput);

                int result = firstNum + secondNum;

                String message = String.format("the Answer is %d", result);
                request.setAttribute("message",message);
            }
            
            if("-".equals(button)){
                int firstNum = Integer.parseInt(firstInput);
                int secondNum = Integer.parseInt(secondInput);

                int result = firstNum - secondNum;

                String message = String.format("the Answer is %d", result);
                request.setAttribute("message",message);
            }
            
            if("x".equals(button)){
                int firstNum = Integer.parseInt(firstInput);
                int secondNum = Integer.parseInt(secondInput);

                int result = firstNum * secondNum;

                String message = String.format("the Answer is %d", result);
                request.setAttribute("message",message);
            }
            
            if("%".equals(button)){
                double firstNum = Integer.parseInt(firstInput);
                double secondNum = Integer.parseInt(secondInput);

                if(secondNum != 0){
                    double result = firstNum/secondNum;
                    String message = String.format("the Answer is %.3f", result);
                    request.setAttribute("message",message);
                }
                else{
                    String message = "Cannot divide by zero!";
                    request.setAttribute("message",message);
                }
            }
        }
        }
        catch(Exception ex)
        {
        String message = "Invalid Input";
        request.setAttribute("message",message);
        }
        
        getServletContext().getRequestDispatcher("/WEB-INF/ArithmeticCalculator.jsp").forward(request, response);
        
    }
}
