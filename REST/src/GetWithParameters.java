import org.junit.Before;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;
import static org.junit.Assert.*;

import java.util.HashMap;

public class GetWithParameters {
    private RestTemplate restTemplate;
    private String url = "http://api.openweathermap.org/data/2.5/weather?q={q}";

    @Before
    public void setUp() {
        restTemplate = new RestTemplate();

    }

    @Test
    public void usingMapForParametersInGet() {
        HashMap<String, String> vars = new HashMap<String, String>();
        vars.put("q", "San Francisco");
        String page = restTemplate.getForObject(url, String.class, vars);
        assertTrue(page.contains("\"id\":800"));
    }
}
