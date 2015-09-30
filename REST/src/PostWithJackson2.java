import org.junit.Before;
import org.junit.Test;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.HashMap;

public class PostWithJackson2 {
    private String service = "http://maps.googleapis.com";
    private String resource = "/maps/api/geocode/{format}";
    private String params = "?address={address}&sensor={sensor}";
    private String url = service + resource + params;
    private RestTemplate restTemplate;

    @Before
    public void setUp() {
        restTemplate = new RestTemplate();
    }

    @Test
    public void testPostWithJack() {
        HashMap<String, String> vars = new HashMap<>();
        vars.put("format", "json");
        vars.put("address", "1600 Amphitheatre Parkway, Mountain View, CA");
        vars.put("sensor", "false");
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        //HttpEntity<HashMap<String, String>> requestEntity = new HttpEntity<HashMap<String, String>>(vars, httpHeaders);
        HttpEntity<String> requestEntity = new HttpEntity<>(httpHeaders);
        ResponseEntity<geocoderesponsepage> response = restTemplate.exchange(url, HttpMethod.POST, requestEntity, geocoderesponsepage.class, vars);

        MediaType responseHeader = response.getHeaders().getContentType();
        //System.out.println(responseHeader);
        //System.out.println(response.getBody());

        System.out.println(response.getBody().getResults().get(0).getFormattedAddress());
        System.out.println(response.getBody().getResults().get(0).getPlaceId());
        System.out.println(response.getBody().getResults().get(0).getAddressComponents().get(5).getLongName());
        System.out.println(response.getBody().getResults().get(0).getGeometry().getViewport().getNortheast().getLat());


    }
}
