package Less7strokiCotAppetit;

class Cat {

    private String name;
    private int appetite;
    private boolean satiety;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = true;
    }
    void info() {
        String isSatiety = !satiety ? "  наелась" : "  голодна";
        System.out.println(name +  isSatiety);
        }
    void eat(Plate plate) {
        if (satiety && plate.decreaseFood(appetite))
            satiety = false;
    }
}

