package com.geekbrains.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "GiveMeTenProductsServlet", urlPatterns = "/ten_products")
public class GiveMeTenProductsServlet extends HttpServlet {
    private static Logger logger = LoggerFactory.getLogger(GiveMeTenProductsServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ProductList list = new ProductList();
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");

        out.println("<html><body><h1>Products</h1><br>");
        out.println("<h2>" + String.format("%50s %50s %50s", "ID", "Title", "Cost")+"</h1>");
        for (Product iter : list.getProducts()) {
            out.println("<h3>" + String.format("%50d %50s %50d", iter.getId(),iter.getTitle(),iter.getCost()) + "</h3>");
        }
        out.println("</body></html>");
        out.close();
    }
}
