package item;

import enums.InstrumentType;
import interfaces.IPlay;

public abstract class Instrument extends Item implements IPlay {

    public InstrumentType type;

    public Instrument(String name, double stockPrice, double sellPrice, InstrumentType type) {
        super(name, stockPrice, sellPrice);
        this.type = type;
    }

    public InstrumentType getType() {
        return type;
    }
}
