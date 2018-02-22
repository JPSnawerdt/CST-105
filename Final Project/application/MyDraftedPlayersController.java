/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nfldraft;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author John
 */
public class MyDraftedPlayersController implements Initializable {

     @FXML
    private TableColumn<NFLPlayer, Integer> playergrade;

    @FXML
    private TableColumn<NFLPlayer, String> playerposition;


    @FXML
    private TableView<NFLPlayer> mydraftedplayers;

    @FXML
    private TableColumn<NFLPlayer, String> playername;

    @FXML
    private Button returnbutton;



    @FXML
    void returnbuttonaction(ActionEvent event) {
            try{


                Stage stage = (Stage) returnbutton.getScene().getWindow();
                // close the page
                stage.close();

    } catch(Exception e){
        System.out.println("Cant load window");
    }
    }
    ArrayList<NFLPlayer> qwert;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
 

        // TODO
    }    
    
    public void SetArray(ArrayList<NFLPlayer> List){
        qwert = List;
        System.out.println(List);
                    ObservableList<NFLPlayer> data= FXCollections.observableArrayList(qwert);
               playerposition.setCellValueFactory(new PropertyValueFactory<NFLPlayer, String> ("position"));

       playername.setCellValueFactory(new PropertyValueFactory<NFLPlayer, String> ("name"));
       playergrade.setCellValueFactory(new PropertyValueFactory<NFLPlayer, Integer> ("grade"));
               mydraftedplayers.setItems(data);

    }
    
}
