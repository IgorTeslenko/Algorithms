package homework3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InvertStringTest {
    @Test
    public void invertStringTest() {
        assertEquals("123", InvertString.invertString("321"));
        assertEquals("?алед ишав каК", InvertString.invertString("Как ваши дела?"));
        assertEquals(".тенралк аларку алраК у алраК ,ылларок ларку ылраК у лраК", InvertString.invertString("Карл у Карлы украл кораллы, Карла у Карла украла кларнет."));
    }

}
