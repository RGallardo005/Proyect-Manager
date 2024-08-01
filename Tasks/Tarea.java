/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tasks;

import Comentarios.Comentarios;
import java.util.ArrayList;
import users.user;

/**
 *
 * @author galla
 */
public class Tarea {
    private int id;
    private String description;
    private Boolean completed;
    private user user;
    private ArrayList<Comentarios> Listcomentario;

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public user getUser() {
        return user;
    }

    public ArrayList<Comentarios> getListcomentario() {
        return Listcomentario;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public void addcomentario(Comentarios Comentarios){ 
        Listcomentario.add(new Comentarios);
    }
    public Tarea(int id, String description, Boolean completed, user user, ArrayList<Comentarios> Listcomentario) {
        this.id = id;
        this.description = description;
        this.completed = completed;
        this.user = user;
        this.Listcomentario = new ArrayList();
    }

    public Tarea() {
        this(0,"",null,null,new ArrayList())
    }

    
}
