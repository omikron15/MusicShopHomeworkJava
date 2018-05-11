import org.junit.Before;
import org.junit.Test;
import shop.Shop;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;

    @Before
    public void setUp() throws Exception {
        shop = new Shop("My Shop");
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
}
