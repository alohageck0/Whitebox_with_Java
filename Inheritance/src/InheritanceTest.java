
public class InheritanceTest {
    public static void main(String[] args) {
        Animal animal = new Animal("scary animal");
        System.out.println(animal.getType());

        Animal dog = new Dog("Dog", "Tuzik", "Chihuahua");
        dog.move();
        dog.
       /* Dog dog = new Dog("Dog", "Tuzik", "Chihuahua");
        System.out.println(dog.getType());
        dog.move();
        animal.move();
        animal.move("Cats");*/
    }
}
