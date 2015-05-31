/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.navegacion;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author pierre
 */
public class InicioController implements Initializable {
    @FXML
    private TextField TxtIngreso;
    @FXML
    private PasswordField TxtPass;
    @FXML
    private Button btnIngresar;
    @FXML
    private Button btnSalir;
    
    navegacion nav = new navegacion();
    
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void accionIngresar(ActionEvent event) throws IOException {
        if (TxtIngreso.getText().equals("pierre") && TxtPass.getText().equals("puya")) {
            Node node = (Node) event.getSource();
            Stage st = (Stage) node.getScene().getWindow();
            Stage panel = new Stage();
            panel.setScene(createScene(loadMainPane()));
            panel.show();
            st.close();
        } else {
            TxtIngreso.clear();
            TxtPass.clear();
            TxtIngreso.requestFocus();
        }
    }

    @FXML
    private void accionSalir(ActionEvent event) {
        System.exit(0);
    }
    
    private Pane loadMainPane() throws IOException{
        FXMLLoader loader = new FXMLLoader();
        Pane mainPane = (Pane) loader.load(getClass().getResourceAsStream(nav.getVentana()));
        MenuController ventana = loader.getController();
        return mainPane;
    }
    private Scene createScene(Pane mainPane) {
        Scene scene = new Scene(mainPane);
        return scene;
    }
}
