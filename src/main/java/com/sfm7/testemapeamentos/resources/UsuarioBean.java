/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.sfm7.testemapeamentos.resources;

//import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
//import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author maced
 */
@Named(value = "usuarioBean")
@RequestScoped
public class UsuarioBean {

    /**
     * Creates a new instance of UsuarioBean
     */
    private Usuario usuario;
    
    public UsuarioBean() {
        usuario = new Usuario();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public String save(){
        System.out.println("> "+usuario);
        return "saida";
    }
}
