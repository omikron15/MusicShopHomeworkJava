package item;

import interfaces.ISell;

public abstract class Item implements ISell {

    private String name;
    protected double sellPrice;
    protected double stockPrice;

    public Item(String name, double stockPrice, double sellPrice) {
        this.name = name;
        this.stockPrice = stockPrice;
        this.sellPrice = sellPrice;
    }

    public String getName() {
        return name;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public double getStockPrice() {
        return stockPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public double calculateMarkup(){
        return (this.sellPrice - this.stockPrice);
    }
}
