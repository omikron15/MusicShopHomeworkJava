package item.instrument;

import item.Instrument;

public class Guitar extends Instrument {

    private int noOfStrings;

    public Guitar(String name, double stockPrice, double sellPrice, int noOfStrings) {
        super(name, stockPrice, sellPrice);
        this.noOfStrings = noOfStrings;
    }

    public String play(){
        return "Play Guitar";
    }

    public int getNoOfStrings(){
        return this.noOfStrings;
    }

}
