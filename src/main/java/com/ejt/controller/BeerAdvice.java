package com.ejt.controller;

import com.ejt.model.BeerExpert;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class BeerAdvice extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String color = request.getParameter("color");
        BeerExpert expert = new BeerExpert();
        List<String> brands = expert.getBrands(color);

        request.setAttribute("styles", brands);
        RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/view/user/beer_advice.jsp");
        view.forward(request, response);
    }
}
