package item;

public abstract class Item {

    private String name;
    private double sellPrice;
    private double stockPrice;

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
}
