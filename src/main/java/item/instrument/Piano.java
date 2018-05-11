package item.instrument;

import enums.InstrumentType;
import item.Instrument;

public class Piano extends Instrument {

    private int noOfKeys;

    public Piano(String name, double stockPrice, double sellPrice, int noOfKeys) {
        super(name, stockPrice, sellPrice, InstrumentType.KEYBOARD);
        this.noOfKeys = noOfKeys;
    }

    public String play(){
        return "Play Piano";
    }

    public int getnoOfKeys(){
        return this.noOfKeys;
    }

}
