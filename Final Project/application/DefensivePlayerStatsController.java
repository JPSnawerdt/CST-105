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
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author John
 */
public class DefensivePlayerStatsController implements Initializable {
        @FXML
    private TableColumn<NFLPlayer, Integer> sacksfield;

    @FXML
    private TableColumn<NFLPlayer, Integer> forcedfumblesfield;
    
       @FXML
    private TableColumn<NFLPlayer, Integer> interceptionsfield;
       
           @FXML
    private TableView<NFLPlayer> offensiveplayerstats;

    @FXML
    private TableColumn<NFLPlayer, Integer> tacklesfield;


    
    @FXML
    private TableView<NFLPlayer> playertable;
@FXML
    private TableColumn<NFLPlayer, Integer> agefield;

    @FXML
    private Label namefield;

    @FXML
    private TableColumn<NFLPlayer, Double> heightfield;

    @FXML
    private Button returnbutton;

    @FXML
    private TableColumn<NFLPlayer, String> positionfield;

    @FXML
    private TableColumn<NFLPlayer, Integer> gradefield;

    @FXML
    private TableColumn<NFLPlayer, Double> weightfield;

    @FXML
    private TableColumn<NFLPlayer, Integer> speedfield;

    @FXML
    private TableColumn<NFLPlayer, Integer> elusivenessfield;

    @FXML
    void returnbuttonactionitem(ActionEvent event) {
        try{


                Stage stage = (Stage) returnbutton.getScene().getWindow();
                // close the page
                stage.close();

    } catch(Exception e){
        System.out.println("Cant load window");
    }
    }
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void SetPlayer(NFLPlayer c){
        ArrayList<NFLPlayer> currentplayer= new ArrayList<>();
        currentplayer.add(c);
        namefield.setText(c.getName());
       ObservableList<NFLPlayer> data= FXCollections.observableArrayList(currentplayer);
               positionfield.setCellValueFactory(new PropertyValueFactory<NFLPlayer, String> ("position"));
               speedfield.setCellValueFactory(new PropertyValueFactory<NFLPlayer, Integer> ("speed"));
               elusivenessfield.setCellValueFactory(new PropertyValueFactory<NFLPlayer, Integer> ("elusiveness"));
               agefield.setCellValueFactory(new PropertyValueFactory<NFLPlayer, Integer> ("age"));
               weightfield.setCellValueFactory(new PropertyValueFactory<NFLPlayer, Double> ("weight"));
               heightfield.setCellValueFactory(new PropertyValueFactory<NFLPlayer, Double> ("height"));
                gradefield.setCellValueFactory(new PropertyValueFactory<NFLPlayer, Integer> ("grade"));
               playertable.setItems(data);
               
               sacksfield.setCellValueFactory(new PropertyValueFactory<NFLPlayer, Integer> ("sacks"));
               forcedfumblesfield.setCellValueFactory(new PropertyValueFactory<NFLPlayer, Integer> ("forcedfumbles"));
               tacklesfield.setCellValueFactory(new PropertyValueFactory<NFLPlayer, Integer> ("tackles"));
               interceptionsfield.setCellValueFactory(new PropertyValueFactory<NFLPlayer, Integer> ("interceptions"));
               
       
               
               offensiveplayerstats.setItems(data);
    }
}
