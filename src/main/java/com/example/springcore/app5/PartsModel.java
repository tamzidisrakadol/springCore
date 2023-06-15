package com.example.springcore.app5;

public class PartsModel {

    String partsType;
    String partsName;

    public PartsModel() {
    }

    public String getPartsType() {
        return partsType;
    }

    public void setPartsType(String partsType) {
        this.partsType = partsType;
    }

    public String getPartsName() {
        return partsName;
    }

    public void setPartsName(String partsName) {
        this.partsName = partsName;
    }

    @Override
    public String toString() {
        return "PartsModel{" +
                "partsType='" + partsType + '\'' +
                ", partsName='" + partsName + '\'' +
                '}';
    }


}
