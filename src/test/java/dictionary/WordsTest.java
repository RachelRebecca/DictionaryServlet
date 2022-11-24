package dictionary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordsTest
{
    @Test
    void isWord_HAPPY()
    {
        Words sd = new Words();

        assertTrue(sd.isWord("HAPPY"));
    }
    @Test
    void isWord_ZOOGEOGRAPHICAL()
    {
        Words sd = new Words();

        assertTrue(sd.isWord("zoogeographical"));
    }

    @Test
    void isWord_FRAGMENT()
    {
        Words sd = new Words();

        assertFalse(sd.isWord("happ"));
    }

    @Test
    void isWord_NOT_PRESENT()
    {
        Words sd = new Words();

        assertFalse(sd.isWord("hapy"));
    }


    @Test
    void getDefinition_HAPPY()
    {
        Words sd = new Words();

        assertEquals("marked by joy [adj -PIER, -PIEST] : HAPPILY [adv]", sd.getDefinition("HAPPY"));
    }

    @Test
    void getDefinition_ZOOGEOGRAPHICAL()
    {
        Words sd = new Words();

        assertEquals("", sd.getDefinition("zoogeographical"));
    }
    @Test
    void getDefinition_FRAGMENT()
    {
        Words sd = new Words();

        assertNull(sd.getDefinition("happ"));
    }
    @Test
    void getDefinition_NOT_PRESENT()
    {
        Words sd = new Words();

        assertNull(sd.getDefinition("hapy"));
    }
}