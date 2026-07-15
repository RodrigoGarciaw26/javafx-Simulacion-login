/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rodrigogarcia.view;

/**
 *
 * @author informatica
 */
public class BienvenidaView extends VBox {
    private static BienvenidaView instnaciaBienvenidaView;
    
    public BienvenidaView(){
        
    }

    public static BienvenidaView getInstnaciaBienvenidaView() {
        //IF
        return instnaciaBienvenidaView;
    }

    public static void setInstnaciaBienvenidaView(BienvenidaView instnaciaBienvenidaView) {
        BienvenidaView.instnaciaBienvenidaView = instnaciaBienvenidaView;
    }
    
    
}
