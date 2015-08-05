
public class Dog extends Animal {
    private String name;
    private String breed;

    public Dog(String aType, String aName, String aBreed) {
        super(aType);
        name = aName;
        breed = aBreed;
    }

    public void Move() {
        System.out.println("Dogs can run");
    }
}
