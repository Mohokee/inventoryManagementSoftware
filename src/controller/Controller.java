    package controller;


    import javafx.collections.FXCollections;
    import javafx.collections.ObservableList;
    import javafx.event.Event;
    import javafx.fxml.FXML;
    import javafx.fxml.FXMLLoader;
    import javafx.fxml.Initializable;
    import javafx.scene.Node;
    import javafx.scene.Parent;
    import javafx.scene.Scene;
    import javafx.scene.control.Alert;
    import javafx.scene.control.Button;
    import javafx.scene.control.TableColumn;
    import javafx.scene.control.TableView;
    import javafx.scene.control.cell.PropertyValueFactory;
    import javafx.stage.Stage;
    import model.Part;
    import model.Product;

    import java.io.IOException;
    import java.net.URL;
    import java.util.ResourceBundle;


    public class Controller implements Initializable {
        @FXML private Button exit;

        //Parts Table Column ID'S
        public TableColumn partId;
        public TableColumn partName;
        public TableColumn partInventory;
        public TableColumn partCost;
        public TableView allParts;

        //Product Table Column ID'S
        public TableColumn productId;
        public TableColumn productName;
        public TableColumn productInventory;
        public TableColumn productCost;
        public TableView allProducts;

        //Parts Buttons
        @FXML private Button addPartsButton;
        @FXML private Button modifyPartsButton;
        @FXML private Button deletePartsButton;

        //Product Buttons
        @FXML private Button addProductButton;
        @FXML private Button modifyProductButton;
        @FXML private Button deleteProductButton;

        //Parts Observable list
        private ObservableList<Part> allPart = FXCollections.observableArrayList();

        //Products Observable list
        private ObservableList<Product> allProduct = FXCollections.observableArrayList();

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

        //Test Data
        Product bike = new Product(1,"Bicycle",350,4,1,8);

        @Override
        public void initialize(URL url, ResourceBundle resourceBundle) {
            //Populate Parts table with Part objects
            allParts.setItems(allPart);

            partId.setCellValueFactory(new PropertyValueFactory<>("id"));
            partName.setCellValueFactory(new PropertyValueFactory<>("name"));
            partInventory.setCellValueFactory(new PropertyValueFactory<>("stock"));
            partCost.setCellValueFactory(new PropertyValueFactory<>("price"));

            //Populate Products table with Product objects
            allProducts.setItems(allProduct);

            productId.setCellValueFactory(new PropertyValueFactory<>("id"));
            productName.setCellValueFactory(new PropertyValueFactory<>("name"));
            productInventory.setCellValueFactory(new PropertyValueFactory<>("stock"));
            productCost.setCellValueFactory(new PropertyValueFactory<>("price"));

        }

    }
