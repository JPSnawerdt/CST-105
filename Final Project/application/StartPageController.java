/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nfldraft;



 
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

 
public class StartPageController {
  

    @FXML
    private Button button;



    @FXML
    void handleButtonAction(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MainPage.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = (Stage) button.getScene().getWindow();
                // do what you have to do
                stage.close();
            Stage newstage = new Stage();
            newstage.setScene(new Scene(root1));
            newstage.setTitle("Main Draft Page");
            newstage.show();
    } catch(Exception e){
        System.out.println("Cant load window");
    }
    }
    @FXML
    void d04949(ActionEvent event) {

    }
    

    }

