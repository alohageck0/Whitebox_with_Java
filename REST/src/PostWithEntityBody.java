import org.junit.Before;
import org.junit.Test;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

public class PostWithEntityBody {
    private String url = "http://www.htmlgoon.com/api/POST_JSON_Service.php";
    private RestTemplate restTemplate;

    @Before
    public void setUp() {
        restTemplate = new RestTemplate();
    }

    @Test
    public void PostWithBody() {
        //specify request headers
        HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.setContentType(MediaType.APPLICATION_JSON);
        HashMap<String, String> entityBody = new HashMap<>();
        entityBody.put("firstname", "Vlad");
        entityBody.put("lastname", "Tester");
        entityBody.put("city", "San Jose");
        // requestEntity includes both headers and body

        HttpEntity<HashMap<String, String>> requestEntity = new HttpEntity<HashMap<String, String>>(entityBody, requestHeaders);
        // post for object
        String result = restTemplate.postForObject(url, requestEntity,String.class);

        //exchange
        //ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST, requestEntity, String.class);
        //System.out.println(response);
        //System.out.println(result);

    }
}
