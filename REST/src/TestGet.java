import org.springframework.web.client.RestTemplate;

public class TestGet {
    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        String page = restTemplate.getForObject("http://jsonview.com/example.json", String.class);
        System.out.println(page);
    }
}
