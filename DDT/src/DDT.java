import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class DDT {
    @FileParameters(value = "file:/Users/royalfiish/IdeaProjects/Mango/address.csv",
            mapper = CsvWithHeaderMapper.class)
    @Test
    public void test(String Name, String Street, String City) {
        System.out.println("Name: "+ Name+ "\nStreet: "+ Street + "\nCity: "+ City+ "\n");
    }
}
