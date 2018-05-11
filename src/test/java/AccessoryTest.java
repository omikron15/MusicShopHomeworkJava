import item.Accessory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AccessoryTest {

    Accessory accessory1;

    @Before
    public void setUp() throws Exception {
        accessory1 = new Accessory("Drum Sticks", 5.00, 7.50, "Standard Drum Sticks");
    }

    @Test
    public void getName() {
        assertEquals("Drum Sticks", accessory1.getName());
    }

    @Test
    public void getStockPrice() {
        assertEquals(5.00, accessory1.getStockPrice(), 0.5);
    }

    @Test
    public void getSellPrice() {
        assertEquals(7.50, accessory1.getSellPrice(), 0.5);
    }

    @Test
    public void getDescription() {
        assertEquals("Standard Drum Sticks", accessory1.getDescription());
    }

    @Test
    public void setSellPrice() {
        accessory1.setSellPrice(10.00);
        assertEquals(10.00, accessory1.getSellPrice(), 0.5);
    }

    @Test
    public void setDescription() {
        accessory1.setDescription("Special Drum Sticks");
        assertEquals("Special Drum Sticks", accessory1.getDescription());
    }
}
