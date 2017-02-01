package ru.pmsoftware.rsm.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.pmsoftware.rsm.repository.InMemoryOperationRepository;

import java.io.IOException;

public class OperationsServlet extends javax.servlet.http.HttpServlet {
    private static final Logger LOG = LoggerFactory.getLogger(OperationsServlet.class);

    private static InMemoryOperationRepository repository = new InMemoryOperationRepository();

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        LOG.info("getAll operations");
        request.setAttribute("operations", repository.getAll(5));
        request.getRequestDispatcher("/operations.jsp").forward(request, response);
    }
}
