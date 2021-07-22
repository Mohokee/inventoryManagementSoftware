package model;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Inventory extends Application {

    private static ObservableList<Part> allParts;
    private  static ObservableList<Product> allProducts;

    //Add Part
    public static void addPart(Part newPart){

    }

    //Add Product
    public static void addProduct(Product newProduct){

    }
    //Look up Parts
    public static Part lookupPart(int partId){

    }
    //Look up Product
    public static Product lookupProduct(int productId){

    }
    //Lookup part list
    public static ObservableList<Part> lookupPart(String partName){

    }
    //Look up product list
    public static ObservableList<Product> lookupProduct(String productName){

    }
    //Update part
    public static void updateProduct(int index, Part selectedPart){

    }
    //Delete part
    public static boolean deletePart(Part selectedPart){
        return false;
    }
    //Delete product
    public static boolean deleteProduct(Product selectedProduct){
        return false;
    }
    //Get all parts list
    public static ObservableList<Part> getAllParts(){

    }
    //Get all products list
    public static ObservableList<Product> getAllProducts(){

    }


    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../view/MainScreen.fxml"));
        primaryStage.setTitle("Inventory");
        primaryStage.setScene(new Scene(root, 680, 500));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
