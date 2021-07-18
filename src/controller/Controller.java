    package controller;


    import javafx.event.Event;
    import javafx.fxml.FXML;
    import javafx.fxml.FXMLLoader;
    import javafx.fxml.Initializable;
    import javafx.scene.Node;
    import javafx.scene.Parent;
    import javafx.scene.Scene;
    import javafx.scene.control.Alert;
    import javafx.scene.control.Button;
    import javafx.stage.Stage;

    import java.io.IOException;
    import java.net.URL;
    import java.util.ResourceBundle;


    public class Controller implements Initializable {
        @FXML private Button exit;

        //Parts Buttons
        @FXML private Button addPartsButton;
        @FXML private Button modifyPartsButton;

        //Product Buttons
        @FXML private Button addProductButton;
        @FXML private Button modifyProductButton;

        /*exitButtonPushed- Closes Program, changes: started with (ActionEvent) event as argument, and kept getting an
        error, changed to (Event event) and it now works*/
        public void exitButtonPushed(Event event){

            System.exit(0);
        }
        /*Change to Scene Controls*/
        public void buttonPushed(Event event) throws IOException {
            //Define page button view
            var buttonName = "../view/AddProduct.fxml";

            //Get the button clicked by comparing with the node in event
            //This was hard, I tried getting the id, but figured out the node should be compared with the button
            Node node = (Node) event.getTarget();
            if(node.equals(addPartsButton))
                buttonName = "../view/AddPart.fxml";
            else if(node.equals(modifyPartsButton))
                buttonName = "../view/ModifyPart.fxml";
            else if(node.equals(addProductButton))
                buttonName = "../view/AddProduct.fxml";
            else if(node.equals(modifyProductButton))
                buttonName = "../view/ModifyProduct.fxml";
            Parent addProductParent = FXMLLoader.load(getClass().getResource(buttonName));
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
