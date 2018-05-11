package item;

import interfaces.IPlay;

public abstract class Instrument extends Item implements IPlay {

    public Instrument(String name, double stockPrice, double sellPrice) {
        super(name, stockPrice, sellPrice);
    }
}
