import org.junit.Before;
import org.junit.Test;
import org.springframework.http.HttpEntity;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

public class PostWithParameters {
    private String service = "https://maps.googleapis.com";
    private String resource = "/maps/api/geocode/{format}";
    private String parameters = "?address={address}&sensor={sensor}";
    private String url = service + resource + parameters;
    private RestTemplate restTemplate;

    @Before
    public void setUp() {
        restTemplate = new RestTemplate();
    }

    @Test
    public void testPostWithJson() {
        HashMap<String, String> vars = new HashMap<>();
        vars.put("format", "json");
        vars.put("address", "1900 The Alameda, San Jose");
        vars.put("sensor", "false");


        HttpEntity<String> entity = new HttpEntity<String>("");
        String page = restTemplate.postForObject(url, entity, String.class, vars);
        System.out.println(page);
    }
}
