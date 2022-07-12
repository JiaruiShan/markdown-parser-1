import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.*;

public class MarkdownParseTest {

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    
    @Test
    public void main() throws IOException {
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> exp = new ArrayList<String>();
        exp.add("https://something.com");
        exp.add("some-thing.html");
        assertEquals(exp, links);
    }

}