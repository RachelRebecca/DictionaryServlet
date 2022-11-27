package dictionary;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Scanner;

public class Words
{
    private final HashMap<String, String> words = new HashMap<>();

    public Words()
    {
        try (InputStream inputStream = Words.class.getResourceAsStream("/dictionary.txt");)
        {
            Scanner scanner = new Scanner(inputStream);
            while (scanner.hasNextLine())
            {
                String line = scanner.nextLine();
                String[] entry = line.split("\\s+", 2);
                if (entry.length == 1)
                {
                    words.put(entry[0], "");
                } else
                {
                    words.put(entry[0], entry[1]);
                }
            }
        } catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }

    public boolean isWord(String lookupWord)
    {
        return getDefinition(lookupWord.toUpperCase()) != null;
    }

    public String getDefinition(String lookupWord)
    {
        return words.get(lookupWord.toUpperCase());
    }
}