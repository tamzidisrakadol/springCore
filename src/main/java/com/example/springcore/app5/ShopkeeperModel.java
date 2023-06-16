package com.example.springcore.app5;

import org.springframework.beans.factory.annotation.Autowired;

public class ShopkeeperModel {

    /* Auto-wiring in spring
     * Feature of Auto Wiring -> AutoWiring cant be used to inject primitive and String value.It only works with reference only
     *XML AutoWiring Modes-> no., byName, byType, constructor
     *Annotation -> @AutoWired
     * byName -> check the dependent model class name and xml file name are same or not then it will auto-inject
     * byType -> it will check the check type of reference is same or not then it will auto-inject*/

    String shopKeeperName;
    PartsModel partsModel;

    StorageModel storageModel;

    public StorageModel getStorageModel() {
        return storageModel;
    }

    public void setStorageModel(StorageModel storageModel) {
        this.storageModel = storageModel;
    }

    public ShopkeeperModel() {
    }

    public String getShopKeeperName() {
        return shopKeeperName;
    }

    public void setShopKeeperName(String shopKeeperName) {
        this.shopKeeperName = shopKeeperName;
    }

    public PartsModel getPartsModel() {
        return partsModel;
    }

    public void setPartsModel(PartsModel partsModel) {
        this.partsModel = partsModel;
    }

    @Override
    public String toString() {
        return "ShopkeeperModel{" +
                "shopKeeperName='" + shopKeeperName + '\'' +
                ", partsModel=" + partsModel +
                ", storageModel=" + storageModel +
                '}';
    }
}
