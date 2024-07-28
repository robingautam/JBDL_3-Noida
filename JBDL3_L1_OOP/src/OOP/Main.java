package OOP;

public class Main {

    public void doNoise(Animal animal){
        animal.makeSound();
    }

    public void eat(Animal animal){
        animal.eat();
    }

    public static void main(String[] args) {
        Main main = new Main();
        Animal animal = new Cat();
        main.doNoise(new Cat());
        main.eat(animal);


    }
}
