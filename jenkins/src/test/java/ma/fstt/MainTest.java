package ma.fstt;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void testAdditionner() {
        Main main = new Main();
        int result = main.additionner(2, 3);
        assertEquals(5, result, "2 + 3 devrait être égal à 5");
    }
}
