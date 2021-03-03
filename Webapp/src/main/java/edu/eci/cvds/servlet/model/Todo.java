package edu.eci.cvds.servlet.model;
/**
 * @author Luis Amaya
 * @author Sebastian Mina
 * @version 1.0 03/03/2021
 */
public class Todo {
    private int userId;
    private int id;
    private String title;
    private boolean completed;
    public Todo(){

    }

    public int getUserId(){
        return userId;
    }
    public int getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public boolean getCompleted(){
        return completed;
    }

    public void setUserId(int userId){
        this.userId = userId;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setCompleted(boolean completed){
        this.completed = completed;
    }
}
