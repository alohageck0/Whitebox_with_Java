
public class InheritanceTest {
    public static void main(String[] args) {
        Animal animal = new Animal("scary animal");
        System.out.println(animal.getType());

        Dog dog = new Dog("Dog", "Tuzik", "Chihuahua");
        System.out.println(dog.getType());
        dog.Move();
    }
}
