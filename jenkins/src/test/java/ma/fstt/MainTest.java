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

    @Test
    public void sub() {
        Main main = new Main();
        int result = main.sub(2, 3);
        assertEquals(-1, result, "2 - 3 devrait être égal à -1 sf");
    }

    @Test
    public void div() {
        Main main = new Main();
        int result = main.div(2, 2);
        assertEquals(1, result, "2 / 2 devrait être égale à 1");
    }
}
