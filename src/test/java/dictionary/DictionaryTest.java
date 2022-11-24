package dictionary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DictionaryTest
{
    @Test
    void isWord_HAPPY()
    {
        Dictionary sd = new Dictionary();

        assertTrue(sd.isWord("HAPPY"));
    }
    @Test
    void isWord_ZOOGEOGRAPHICAL()
    {
        Dictionary sd = new Dictionary();

        assertTrue(sd.isWord("zoogeographical"));
    }

    @Test
    void isWord_FRAGMENT()
    {
        Dictionary sd = new Dictionary();

        assertFalse(sd.isWord("happ"));
    }

    @Test
    void isWord_NOT_PRESENT()
    {
        Dictionary sd = new Dictionary();

        assertFalse(sd.isWord("hapy"));
    }


    @Test
    void getDefinition_HAPPY()
    {
        Dictionary sd = new Dictionary();

        assertEquals("marked by joy [adj -PIER, -PIEST] : HAPPILY [adv]", sd.getDefinition("HAPPY"));
    }

    @Test
    void getDefinition_ZOOGEOGRAPHICAL()
    {
        Dictionary sd = new Dictionary();

        assertEquals("", sd.getDefinition("zoogeographical"));
    }
    @Test
    void getDefinition_FRAGMENT()
    {
        Dictionary sd = new Dictionary();

        assertNull(sd.getDefinition("happ"));
    }
    @Test
    void getDefinition_NOT_PRESENT()
    {
        Dictionary sd = new Dictionary();

        assertNull(sd.getDefinition("hapy"));
    }
}