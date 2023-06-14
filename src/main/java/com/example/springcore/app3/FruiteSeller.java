package com.example.springcore.app3;

public class FruiteSeller {

    String sellerName;
    String sellerVoterID;

    public FruiteSeller(String sellerName, String sellerVoterID) {
        this.sellerName = sellerName;
        this.sellerVoterID = sellerVoterID;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getSellerVoterID() {
        return sellerVoterID;
    }

    public void setSellerVoterID(String sellerVoterID) {
        this.sellerVoterID = sellerVoterID;
    }

    @Override
    public String toString() {
        return "FruiteSeller{" +
                "sellerName='" + sellerName + '\'' +
                ", sellerVoterID='" + sellerVoterID + '\'' +
                '}';
    }
}
