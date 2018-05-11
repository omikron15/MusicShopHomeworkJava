import item.Accessory;
import item.instrument.Guitar;
import item.instrument.Piano;
import org.junit.Before;
import org.junit.Test;
import shop.Shop;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Piano piano;
    Guitar guitar;
    Accessory accessory;

    @Before
    public void setUp() throws Exception {
        shop = new Shop("My Shop");
        piano = new Piano("Piano 1", 100.00, 200.00, 48);
        guitar = new Guitar("Guitar 1", 100.00, 200.00, 7);
        accessory = new Accessory("Drum Sticks", 5.00, 7.50, "Standard Drum Sticks");
    }

    @Test
    public void getName() {
        assertEquals("My Shop", shop.getName());
    }

    @Test
    public void setname() {
        shop.setName("New Name");
        assertEquals("New Name", shop.getName());
    }

    @Test
    public void getStockCount() {
        assertEquals(0, shop.getStockCount());
    }

    @Test
    public void addStock() {
        shop.addStock(piano);
        assertEquals(1, shop.getStockCount());
    }

    @Test
    public void removeStock() {
        shop.addStock(piano);
        shop.addStock(guitar);
        shop.removeStock(piano);
        assertEquals(1, shop.getStockCount());
    }

    // list all instruments
    //list all accessories
}
