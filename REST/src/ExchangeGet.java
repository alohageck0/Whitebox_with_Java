import org.junit.Before;
import org.junit.Test;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

import static org.springframework.http.MediaType.*;

public class ExchangeGet {
    private RestTemplate restTemplate;
    private String url = "http://api.openweathermap.org/data/2.5/weather?q=Denver";

    @Before
    public void setUp() {
        restTemplate = new RestTemplate();
    }

    @Test
    public void getResponseAndHeadersAsString() {
        HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.setAccept(Arrays.asList(APPLICATION_JSON));

        HttpEntity<String> requestEntity = new HttpEntity<String>(requestHeaders);

        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, requestEntity, String.class);
        String body = response.getBody();
        System.out.println("Body " + body);
    }
}