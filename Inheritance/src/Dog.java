
public class Dog extends Animal {
    private String name;
    private String breed;

    public Dog(String aType, String aName, String aBreed) {
        super(aType);
        name = aName;
        breed = aBreed;
    }

    public void move() {
        System.out.println("Dogs can run");
    }
}
