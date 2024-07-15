public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Buddy");
        Animal duck = new Duck("Daisy");
        Animal cat = new Cat("Whiskers");

        System.out.println("Dog's name: " + dog.getName());
        dog.sound();

        System.out.println("Duck's name: " + duck.getName());
        duck.sound();

        System.out.println("Cat's name: " + cat.getName());
        cat.sound();
    }
}
