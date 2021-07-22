package model;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableList;

public class Product {
    //Variable Declaration
    private ObservableList<Part> associatedParts;
    private String name;
    private double price;
    private int id,stock,min,max;



    public Product(int id, String name, double price, int stock, int min, int max){
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.min = min;
        this.max = max;

    }

    //Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }

    //Getters

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }


    //Part Methods
    public void addAssociatedPart(Part part){

    }
    public boolean deleteAssociatedPart(Part selectedAssociatedPart){

        return false;
    }
    public ObservableList<Part> getAllAssociatedParts(){
        return null;
    }
}
