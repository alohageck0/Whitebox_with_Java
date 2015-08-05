
public class Animal {
    private String type;

    public Animal(String aType) {
        type = aType;

    }

    public String getType() {
        return type;
    }

    public void move(){
        System.out.println("Animals can move");
    }
}
