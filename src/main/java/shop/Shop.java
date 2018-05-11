package shop;

import interfaces.ISell;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStockCount(){
        return this.stock.size();
    }

    public void addStock(ISell item){
        stock.add(item);
    }

    public void removeStock(ISell item){
        stock.remove(item);
    }

}
