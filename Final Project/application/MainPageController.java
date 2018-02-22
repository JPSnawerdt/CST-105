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
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
public class MainPageController implements Initializable {

    @FXML
    private Button draftplayer;

    @FXML
    private Button draftedbutton;

    @FXML
    private TableColumn<NFLPlayer, Integer> GradeTable;

    @FXML
    private TextField filterField;
    
    @FXML
    private TableColumn<NFLPlayer, String> NameTable;

    @FXML
    private TableColumn<NFLPlayer, String> StatusTable;

    @FXML
    private Button playerbutton;

    @FXML
    private TableColumn<NFLPlayer, String> PositionTable;

    @FXML
    private Button endbutton;

    @FXML
    private TableView<NFLPlayer> ViewPlayers;

    @FXML
    private Button removebutton;

    @FXML
    void searchbuttonaction(ActionEvent event) {

    }

    @FXML
    void enddraftbuttonaction(ActionEvent event) {
     try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("EndDraft.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));  
            stage.show();
    } catch(Exception e){
        System.out.println("Cant load window");
    }
    }

    @FXML
    void removeplayeraction(ActionEvent event) {
            int selectedItem = ViewPlayers.getSelectionModel().getSelectedIndex();
            data.remove(selectedItem);
    }

    @FXML
    void draftplayerbuttonaction(ActionEvent event) {
            NFLPlayer selectedItem = ViewPlayers.getSelectionModel().getSelectedItem();
            selectedItem.setStatus("Drafted");
            draftedplayersfortable.add(selectedItem);
            ViewPlayers.refresh();
            System.out.println(draftedplayersfortable);
    }

    @FXML
    void playerbuttonaction(ActionEvent event) {
        
                
                    //passes selected item to the player card
          NFLPlayer selectedItem = ViewPlayers.getSelectionModel().getSelectedItem();
             
         if (selectedItem.getPosition().equals("OL") || selectedItem.getPosition().equals("QB") || 
                 selectedItem.getPosition().equals("RB") || selectedItem.getPosition().equals("WR") || selectedItem.getPosition().equals("TE")){    
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("PlayerStats.fxml"));

             try{
                 fxmlLoader.load();
                } catch(Exception e){
            System.out.println("Cant load window");
                }
            PlayerStatsController display= fxmlLoader.getController();
            display.SetPlayer(selectedItem);
            Parent root1 = fxmlLoader.getRoot();
            Stage newstage = new Stage();
            newstage.setScene(new Scene(root1));  
            newstage.show();
         }
         
         else{
             FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("DefensivePlayerStats.fxml"));
             
             try{
                 fxmlLoader.load();
                } catch(Exception e){
            System.out.println("Cant load window");
                }
            DefensivePlayerStatsController display= fxmlLoader.getController();
            display.SetPlayer(selectedItem);
            Parent root1 = fxmlLoader.getRoot();
            Stage newstage = new Stage();
            newstage.setScene(new Scene(root1));  
            newstage.show();
         }
    }

    @FXML
    void draftedbuttonaction(ActionEvent event) {
        
                
                    //loads the drafted players
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MyDraftedPlayers.fxml"));

             try{
                 fxmlLoader.load();
                } catch(Exception e){
        System.out.println("Cant load window");
                }
            MyDraftedPlayersController display= fxmlLoader.getController();
            display.SetArray(draftedplayersfortable);
            Parent root1 = fxmlLoader.getRoot();
            Stage newstage = new Stage();
            newstage.setScene(new Scene(root1));
            newstage.setTitle("My Drafted Players");
            newstage.show();

    

    }
NFLPlayerManager NFLPlayers = new NFLPlayerManager();    
public ArrayList<NFLPlayer> draftedplayersfortable = new ArrayList<>();

ObservableList<NFLPlayer> data = FXCollections.observableList(NFLPlayerManager.Players);
    public void initialize(URL url, ResourceBundle rb) {

        //create player manager and adds players to it
   
        NFLPlayers.createPlayers();
            //takes players made in the player manager and adds to observable list


        
        

        //links data from player manager to table
        PositionTable.setCellValueFactory(new PropertyValueFactory<NFLPlayer, String> ("position"));
        StatusTable.setCellValueFactory(new PropertyValueFactory<NFLPlayer, String> ("status"));
       NameTable.setCellValueFactory(new PropertyValueFactory<NFLPlayer, String> ("name"));
       GradeTable.setCellValueFactory(new PropertyValueFactory<NFLPlayer, Integer> ("grade"));
        
        FilteredList<NFLPlayer> filteredData = new FilteredList<>(data, p -> true);
        
       filterField.textProperty().addListener((observable, oldValue, newValue) -> {
            filteredData.setPredicate(person -> {
                // If filter text is empty, display all persons.
                if (newValue == null || newValue.isEmpty()) {
                    return true;
                }

                // Compare first name and last name of every person with filter text.
                String lowerCaseFilter = newValue.toLowerCase();

                if (person.getName().toLowerCase().contains(lowerCaseFilter)) {
                    return true; // Filter matches first name.
                }
                
                return false; // Does not match.
            });
        });

        // 3. Wrap the FilteredList in a SortedList. 
        SortedList<NFLPlayer> sortedData = new SortedList<>(filteredData);

        // 4. Bind the SortedList comparator to the TableView comparator.
        sortedData.comparatorProperty().bind(ViewPlayers.comparatorProperty());

        // 5. Add sorted (and filtered) data to the table.
        ViewPlayers.setItems(sortedData);
           
        
    }    
    
}
