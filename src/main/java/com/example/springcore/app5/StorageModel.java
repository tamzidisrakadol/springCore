package com.example.springcore.app5;

public class StorageModel {

    String shelfName;
    int quantity;

    public StorageModel() {
    }

    public String getShelfName() {
        return shelfName;
    }

    public void setShelfName(String shelfName) {
        this.shelfName = shelfName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "StorageModel{" +
                "shelfName='" + shelfName + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
