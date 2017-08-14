package com.ejt;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class DispatcherServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);

        PrintWriter out = resp.getWriter();
        Date date = new Date();
        out.print("<html><head>" +
                "<title>First Java Pages</title></head>" +
                "<body>" +
                "<h1>Servlet</h1>" +
                "<h4>Today is: " + date + "</h4>" +
                "</body></html>");
    }


}
