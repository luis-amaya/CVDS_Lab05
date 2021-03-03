package edu.eci.cvds.servlet;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Writer;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Optional;

import javax.faces.context.ResponseWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.Response;

import edu.eci.cvds.servlet.model.Todo;


@WebServlet(
    urlPatterns = "/extendServlet"
)

public class ExtendServlet extends HttpServlet{

    private static final long serialVersionUID = 35L;

    @Override
    protected void doGet(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws javax.servlet.ServletException, java.io.IOException {
        Writer responseWriter = resp.getWriter();
        Optional<String> optName = Optional.ofNullable(req.getParameter("id"));
        try {
            if(optName.isPresent()){
                resp.setStatus(HttpServletResponse.SC_OK);
                String stringId = optName.get();
                int id = Integer.parseInt(stringId);
                Todo todo = Service.getTodo(id);
                ArrayList<Todo> todoList = new ArrayList<Todo>();
                todoList.add(todo);
                responseWriter.write(Service.todosToHTMLTable(todoList));
            }
        } catch (FileNotFoundException e) {
            resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
            responseWriter.write("No se encontro item con el id indicado");
        } catch(MalformedURLException e){
            resp.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            responseWriter.write("Error interno en el servidor");
        } catch(NumberFormatException e ){
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            responseWriter.write("Requerimiento invalido");
        } catch(Exception e){
            resp.setStatus(HttpServletResponse.SC_EXPECTATION_FAILED);
            responseWriter.write("Requerimiento invalido");
        } finally{
            responseWriter.flush();
        }
    }

    @Override
    protected void doPost(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws javax.servlet.ServletException, java.io.IOException {
        Writer responseWriter = resp.getWriter();
        Optional<String> optName = Optional.ofNullable(req.getParameter("id"));
        try {
            if(optName.isPresent()){
                resp.setStatus(HttpServletResponse.SC_OK);
                String stringId = optName.get();
                int id = Integer.parseInt(stringId);
                Todo todo = Service.getTodo(id);
                ArrayList<Todo> todoList = new ArrayList<Todo>();
                todoList.add(todo);
                responseWriter.write(Service.todosToHTMLTable(todoList));
            }
        } catch (FileNotFoundException e) {
            resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
            responseWriter.write("No se encontro item con el id indicado");
        } catch(MalformedURLException e){
            resp.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            responseWriter.write("Error interno en el servidor");
        } catch(NumberFormatException e ){
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            responseWriter.write("Requerimiento invalido");
        } catch(Exception e){
            resp.setStatus(HttpServletResponse.SC_EXPECTATION_FAILED);
            responseWriter.write("Requerimiento invalido");
        } finally{
            responseWriter.flush();
        }
    }
}