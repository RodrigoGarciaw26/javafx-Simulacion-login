/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rodrigogarcia.controller;

import com.rodrigogarcia.model.Usuario;
import java.util.ArrayList;
import com.rodrigogarcia.model.Rol;

public class AuthSistema {

    private static ArrayList<Usuario> listaUsuarios = new ArrayList<>();

    public AuthSistema() {
        Usuario usuarioAdmin = new Usuario("admin ", "admin ", "admin ", Rol.ADMIN);
        Usuario usuarioUser = new Usuario("user ", "user", "user", Rol.USER);
        Usuario userYo = new Usuario("Rodrigo ", "123", "Rodrigo ", Rol.USER);

        listaUsuarios.add(usuarioAdmin);
        listaUsuarios.add(usuarioUser);
        listaUsuarios.add(userYo);

    }

    public Usuario login(String nombreUsuario, String clave) {
        for (Usuario usuarioBuscado : listaUsuarios) {
            if (usuarioBuscado.getNombreUsuario().equals(nombreUsuario)
                    && usuarioBuscado.getPassword().equals(clave)) {
                return usuarioBuscado;
            }
        }
        return null;
    }

    public static ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public static void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        AuthSistema.listaUsuarios = listaUsuarios;
    }
    

}
