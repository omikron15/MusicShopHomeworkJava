package item.instrument;

import enums.InstrumentType;
import item.Instrument;

public class Guitar extends Instrument {

    private int noOfStrings;

    public Guitar(String name, double stockPrice, double sellPrice, int noOfStrings) {
        super(name, stockPrice, sellPrice, InstrumentType.STRING);
        this.noOfStrings = noOfStrings;
    }

    public String play(){
        return "Play Guitar";
    }

    public int getNoOfStrings(){
        return this.noOfStrings;
    }

}
