package com.geekbrains.app;

import com.geekbrains.app.Domain.ProductList;
import com.geekbrains.app.Servise.Impl.ProductServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        ProductList list = new ProductList();
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");
        out.println(new ProductServiceImpl(10).getTextHTML());
        out.close();
    }
}
