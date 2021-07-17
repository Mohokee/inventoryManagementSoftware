    package controller;

    import javafx.event.ActionEvent;
    import javafx.event.Event;
    import javafx.fxml.FXML;
    import javafx.fxml.FXMLLoader;
    import javafx.fxml.Initializable;
    import javafx.scene.Node;
    import javafx.scene.Parent;
    import javafx.scene.Scene;
    import javafx.scene.control.Button;
    import javafx.stage.Stage;

    import java.io.IOException;
    import java.net.URL;
    import java.util.ResourceBundle;


    public class Controller implements Initializable {
        @FXML private Button exit;

        /*exitButtonPushed- Closes Program, changes: started with (ActionEvent) event as argument, and kept getting an
        error, changed to (Event event) and it now works*/
        public void exitButtonPushed(Event event){

            System.exit(0);
        }
        /*Change to Add Product Scene Controls*/
        public void addProductButtonPushed(Event event) throws IOException {
            Parent addProductParent = FXMLLoader.load(getClass().getResource("../view/AddProduct.fxml"));
            Scene addProductScene = new Scene(addProductParent);

            //Gets stage info
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(addProductScene);
            window.show();
        }

        @Override
        public void initialize(URL url, ResourceBundle resourceBundle) {

        }
    }
