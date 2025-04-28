package com.page.core;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class ProcessFormServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double num1 = Double.parseDouble(request.getParameter("num1"));
        double num2 = Double.parseDouble(request.getParameter("num2"));
        String operation = request.getParameter("operation");

        ArithmeticOP dao = new ArithmeticOP();
        double result = dao.compute(num1, num2, operation);

        request.setAttribute("result", result);

        RequestDispatcher rd = request.getRequestDispatcher("ResultServlet");
        rd.forward(request, response);
    }
}
