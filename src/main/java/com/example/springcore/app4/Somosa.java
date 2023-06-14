package com.example.springcore.app4;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Somosa implements InitializingBean,DisposableBean{

    //Implementing bean life cycle using interfaces

    private int perKgPrice;

    public Somosa() {
    }

    public int getPerKgPrice() {
        return perKgPrice;
    }

    public void setPerKgPrice(int perKgPrice) {
        this.perKgPrice = perKgPrice;
    }

    @Override
    public String toString() {
        return "Somosa{" +
                "perKgPrice=" + perKgPrice +
                '}';
    }

    @Override
    public void destroy(){
        System.out.println("this is destroy method calling");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("This is init method calling");
    }


}
