/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rodrigogarcia.controller;

import com.rodrigogarcia.controller.LoginController;
import com.rodrigogarcia.view.LoginView;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javax.swing.JOptionPane;

/**
 *
 * @author informatica
 */
    public class SceneManager {
    private static SceneManager instanciaSceneManager;
    private Stage escenarioPrincipal;
    private Stage escenarioSecundaria;
    private Scene escenaPrincipal;

    private SceneManager() {
    } 
    
    public void cambiarEscena( Pane panel, int ancho, int alto ){
        try{
            escenaPrincipal  = new Scene(panel, ancho, alto);
            escenarioPrincipal.setScene(escenaPrincipal);
            escenarioPrincipal.sizeToScene();
            escenarioPrincipal.show();
        }catch (NullPointerException objetivoNulo){ 
            JOptionPane.showMessageDialog(null, "Error de objeto nulo: Cambiar Escena Principal");
            objetivoNulo . printStackTrace(); //Imprime todo el camino hacia el error
        }catch (Exception errorPadre){
            JOptionPane.showMessageDialog(null, "Error padre: Cmabiar Escena Principal");
            errorPadre . printStackTrace();
        }
    }
    
    public void ventanaLogin(){
        try{
            //Metodo que oculta las opciones de ventana por defecto
            this.escenarioPrincipal.initStyle(StageStyle.TRANSPARENT);
            LoginView login = LoginView.getInstanciaLoginView();
            cambiarEscena(login, 450, 500);
            this.escenaPrincipal.setFill(Color.TRANSPARENT); //Fondo de la escena
            new LoginController(login);
            
        }catch (NullPointerException objetivoNulo){ 
            JOptionPane.showMessageDialog(null, "Error de objeto nulo: Ventana Login");
            objetivoNulo . printStackTrace(); //Imprime todo el camino hacia el error
        }catch (Exception errorPadre){
            JOptionPane.showMessageDialog(null, "Error padre:Ventana Login");
            errorPadre . printStackTrace();
        }
    }
    
    public void ventanaBienvenida(){
          try{
            //Metodo que oculta las opciones de ventana por defecto
            escenarioSecundario = new Stage();
            this.escenarioPrincipal.initStyle(StageStyle.TRANSPARENT);
            this.escenaPrincipal.setFill(Color.TRANSPARENT); //Fondo de la escena
            BienvenidaView bienvenida = new BienvenidaView();
            escenaPrincipal = new Scene ( bienvenida, 200, 300);
            this.escenarioSecundario.setScene(escenaPrincipal);
            
        }catch (NullPointerException objetivoNulo){ 
            JOptionPane.showMessageDialog(null, "Error de objeto nulo: Ventana Login");
            objetivoNulo . printStackTrace(); //Imprime todo el camino hacia el error
        }catch (Exception errorPadre){
            JOptionPane.showMessageDialog(null, "Error padre:Ventana Login");
            errorPadre . printStackTrace();
        }
    }
    

    public static SceneManager getInstanciaSceneManager() {
        if( instanciaSceneManager == null)
            instanciaSceneManager = new SceneManager();
        return instanciaSceneManager;
    }

    public static void setInstanciaSceneManager(SceneManager instanciaSceneManager) {
        SceneManager.instanciaSceneManager = instanciaSceneManager;
    }

    public Stage getEscenarioPrincipal() {
        return escenarioPrincipal;
    }

    public void setEscenarioPrincipal(Stage escenarioPrincipal) {
        this.escenarioPrincipal = escenarioPrincipal;
    }

    public Stage getEscenarioSecundaria() {
        return escenarioSecundaria;
    }

    public void setEscenarioSecundaria(Stage escenarioSecundaria) {
        this.escenarioSecundaria = escenarioSecundaria;
    }

    public Scene getEscenaPrincipal() {
        return escenaPrincipal;
    }

    public void setEscenaPrincipal(Scene escenaPrincipal) {
        this.escenaPrincipal = escenaPrincipal;
    }
    
    
    
    
}
