package webapp;

import com.google.gson.Gson;
import dictionary.Dictionary;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

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
        Dictionary dictionary = new Dictionary();
        String definition = dictionary.getDefinition(word.toUpperCase()) == null
                ? "No definition found"
                : dictionary.getDefinition(word.toUpperCase());
        res.setContentType("text/json");
        res.getWriter().println(gson.toJson(definition + " " + word.toUpperCase()));

    }
}
