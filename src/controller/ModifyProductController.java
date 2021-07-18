package controller;

import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ModifyProductController implements Initializable {
    /*Change to Scene Controls*/
    public void cancelAdd(Event event) throws IOException
    {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("../view/MainScreen.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);

        //This line gets the Stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(tableViewScene);
        window.show();
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
