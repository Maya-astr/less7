package Less7strokiCotAppetit;

public class MainClass {
    public static void main(String[] args) {
        Cat[] cats = {
            new Cat("Плюша", 7),
            new Cat("Муся", 12),
            new Cat("Цаца", 15),
            new Cat("Маркиза", 12),
            new Cat("Талия", 15),


        };

        Plate plate = new Plate(100);

        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();
        }

        plate.addFood(0);
        plate.info();
    }

}
