package dictionary;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Words
{
    private final HashMap<String, String> words = new HashMap<>();

    public Words()
    {
        File file = new File("dictionary.txt");
        try
        {
            Scanner scanner = new Scanner(file);
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
            e.printStackTrace();
        }
    }

    public Words(List<String> lines)
    {
        for (int i = 0; i < lines.size(); i++)
        {
            String[] entry = lines.get(i).split("\\s+", 2);
            if (entry.length == 1)
            {
                words.put(entry[0], "");
            } else
            {
                words.put(entry[0], entry[1]);
            }
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