/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comentarios;

import users.user;

/**
 *
 * @author javierortizdobles
 */
public class Comentarios {
    private int id;
    private user user;
    private String comment;

    public int getId() {
        return id;
    }

    public user getUser() {
        return user;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Comentarios(int id, user user, String comment) {
        this.id = id;
        this.user = user;
        this.comment = comment;
    }

    public Comentarios() {
        this(0,null,"");
    }
    
    
    
            
}
