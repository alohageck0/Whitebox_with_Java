import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.web.client.RestTemplate;

@RunWith(JUnitParamsRunner.class)
public class TestSF {
    @Test
    @FileParameters(value = "file:/Users/royalfiish/IdeaProjects/Mango/cities.csv",
            mapper = CsvWithHeaderMapper.class)
    public static void TestWeather(String city) throws InterruptedException {
        RestTemplate restTemplate = new RestTemplate();
        String page = restTemplate.getForObject("http://api.openweathermap.org/data/2.5/weather?q=" + city, String.class);
        System.out.println(page);
        Thread.sleep(1000);
    }
}
