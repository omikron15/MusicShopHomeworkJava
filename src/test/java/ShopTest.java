import item.Accessory;
import item.instrument.Guitar;
import item.instrument.Piano;
import org.junit.Before;
import org.junit.Test;
import shop.Shop;

import java.util.ArrayList;

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

    @Test
    public void calculateShopPotentialProfit() {
        shop.addStock(piano);
        shop.addStock(guitar);
        assertEquals(200, shop.calculateShopPotentialProfit(), 0.1);
    }

    @Test
    public void listInstruments() {
        shop.addStock(piano);
        shop.addStock(guitar);
        shop.addStock(accessory);
        ArrayList<String> results;
        results = shop.displayItemNames(shop.listInstruments());
        assertEquals(2, results.size() );
    }

    @Test
    public void listAccessories() {
        shop.addStock(piano);
        shop.addStock(guitar);
        shop.addStock(accessory);
        ArrayList<String> results;
        results = shop.displayItemNames(shop.listAccessories());
        assertEquals(1, results.size() );
    }

}
