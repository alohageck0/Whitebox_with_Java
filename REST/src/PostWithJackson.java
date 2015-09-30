import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.HashMap;

public class PostWithJackson {
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
        //requestHeaders.setContentType(MediaType.APPLICATION_JSON);
        requestHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HashMap<String, String> entityBody = new HashMap<>();
        entityBody.put("firstname", "Vlad");
        entityBody.put("lastname", "Tester");
        entityBody.put("city", "San Jose");
        // requestEntity includes both headers and body test

        HttpEntity<HashMap<String, String>> requestEntity = new HttpEntity<HashMap<String, String>>(entityBody, requestHeaders);
        // post for object
        ResponseEntity<String> result = restTemplate.exchange(url, HttpMethod.POST, requestEntity, String.class);


        System.out.println(result.getBody());
        MediaType responseHeader = result.getHeaders().getContentType();
        System.out.println("Content-type" + responseHeader);

        JSONParser jsonParser = new JSONParser();
        try {
            JSONObject jsonObject = (JSONObject) jsonParser.parse(result.getBody());
            String message = (String) jsonObject.get("message");
            String status = (String) jsonObject.get("status");
            System.out.println(message);
            System.out.println(status);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
