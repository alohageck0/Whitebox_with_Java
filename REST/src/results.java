import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class results {

    @JsonProperty("address_components")
    private List<AddresComponents> addressComponents;
    @JsonProperty("formatted_address")
    private String formattedAddress;
    private Geometry geometry;
    @JsonProperty("place_id")
    private String placeId;
    private List<String> types;


    public void setAddressComponents(List<AddresComponents> addressComponents) {
        this.addressComponents = addressComponents;
    }
    public List<AddresComponents> getAddressComponents() {
        return addressComponents;
    }


    public void setFormattedAddress(String formattedAddress) {
        this.formattedAddress = formattedAddress;
    }
    public String getFormattedAddress() {
        return formattedAddress;
    }


    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }
    public Geometry getGeometry() {
        return geometry;
    }


    public void setPlaceId(String placeId) {
        this.placeId = placeId;
    }
    public String getPlaceId() {
        return placeId;
    }


    public void setTypes(List<String> types) {
        this.types = types;
    }
    public List<String> getTypes() {
        return types;
    }

}