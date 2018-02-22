/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nfldraft;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author John
 */
public class EndDraftController implements Initializable {
@FXML
    private Button returnbutton;

    @FXML
    private Button exitbutton;

    @FXML
    void exitbuttonhandle(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void returnbuttonhandle(ActionEvent event) {
        try{

                Stage stage = (Stage) returnbutton.getScene().getWindow();

                stage.close();

    } catch(Exception e){
        System.out.println("Cant load window");
    }
    }
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
