package webapp;

import com.google.gson.Gson;
import dictionary.Words;
import org.apache.commons.io.FileUtils;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Dictionary;
import java.util.List;

public class DictionaryServlet extends HttpServlet
{
    private final Gson gson;

    public DictionaryServlet()
    {
        gson = new Gson();
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
    {
        // http://localhost:8080/DictionaryServlet-1.0-SNAPSHOT/dictionary?word=happy
        String word = req.getParameter("word");

        getServletContext().getResource("/dictionary.txt");

        // List<String> lines = FileUtils.readLines(new File("dictionary.txt"));
        // Words words = new Words(lines);
        Words words = new Words();

        String definition = words.getDefinition(word) == null
                ? "No definition found"
                : words.getDefinition(word);
        res.setContentType("text/json");
        res.getWriter().println(gson.toJson(definition));
    }
}
