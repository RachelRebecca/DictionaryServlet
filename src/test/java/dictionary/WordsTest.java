package dictionary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordsTest
{
    @Test
    void isWord_Happy()
    {
        Words sd = new Words();

        assertTrue(sd.isWord("HAPPY"));
    }

    @Test
    void isWord_Zoogeographical()
    {
        Words sd = new Words();

        assertTrue(sd.isWord("zoogeographical"));
    }

    @Test
    void isWord_Fragment()
    {
        Words sd = new Words();

        assertFalse(sd.isWord("happ"));
    }

    @Test
    void isWord_NotPresent()
    {
        Words sd = new Words();

        assertFalse(sd.isWord("hapy"));
    }

    @Test
    void getDefinition_Happy()
    {
        Words sd = new Words();

        assertEquals("marked by joy [adj -PIER, -PIEST] : HAPPILY [adv]",
                sd.getDefinition("HAPPY"));
    }

    @Test
    void getDefinition_Zoogeographical()
    {
        Words sd = new Words();

        assertEquals("", sd.getDefinition("zoogeographical"));
    }

    @Test
    void getDefinition_Fragment()
    {
        Words sd = new Words();

        assertNull(sd.getDefinition("happ"));
    }

    @Test
    void getDefinition_NotFragment()
    {
        Words sd = new Words();

        assertNull(sd.getDefinition("hapy"));
    }
}