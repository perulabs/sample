/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.InicioController;
import Controlador.MenuController;

/**
 *
 * @author pierre
 */
public class navegacion {

     
    private String inicio = "/Vista/inicio.fxml";
    private String ventana = "/Vista/menu.fxml";
     
    private static InicioController InicioController ;

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getVentana() {
        return ventana;
    }

    public void setVentana(String ventana) {
        this.ventana = ventana;
    }
    
    public static  void setStageController (InicioController inicioController){
      navegacion.InicioController = InicioController;
    }
       
}
