package item;

public class Accessory extends Item {

    private String description;

    public Accessory(String name, double sellPrice, double stockPrice, String description) {
        super(name, sellPrice, stockPrice);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
