package prg.sachin.controller;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;

import prg.sachin.dao.ConfigLoader;

public class AppInitServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    public void init() throws ServletException {
        ServletContext context = getServletContext();
        String configPath = context.getRealPath("/WEB-INF/db-config");
        System.out.println(configPath);

        System.out.println("Loading db-config from: " + configPath);
        ConfigLoader.load(configPath);
    }
}
