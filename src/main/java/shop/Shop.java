package shop;

import interfaces.ISell;
import item.Accessory;
import item.Instrument;
import item.Item;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<Item> stock;

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

    public void addStock(Item item){
        stock.add(item);
    }

    public void removeStock(Item item){
        stock.remove(item);
    }

    public double calculateShopPotentialProfit(){
        double total = 0.0;
        for (Item item : stock){
            total += item.calculateMarkup();
        }
        return total;
    }

    public ArrayList<Item> listInstruments(){
        ArrayList<Item> instruments = new ArrayList<>();
        for (Item item : stock){
            if( item instanceof Instrument){
                instruments.add(item);
            }
        }
        return instruments;
    }

    public ArrayList<Item> listAccessories(){
        ArrayList<Item> accessories = new ArrayList<>();
        for (Item item : stock){
            if( item instanceof Accessory){
                accessories.add(item);
            }
        }
        return accessories;
    }

    public ArrayList<String> displayItemNames(ArrayList<Item> itemList) {
        ArrayList<String> itemNames = new ArrayList<>();

        for (Item item : itemList){
            itemNames.add(item.getName());
        }

        return itemNames;
    }
}
