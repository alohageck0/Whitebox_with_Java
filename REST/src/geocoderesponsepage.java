import java.util.List;


public class geocoderesponsepage {

    private List<results> results;
    private String status;


    public void setResults(List<results> results) {
        this.results = results;
    }

    public List<results> getResults() {
        return results;
    }


    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

}