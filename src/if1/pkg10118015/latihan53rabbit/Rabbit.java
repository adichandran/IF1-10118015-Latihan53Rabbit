package if1.pkg10118015.latihan53rabbit;

public class Rabbit extends Animal{
    private String color;
    private String name;

    public Rabbit(String color, String name,boolean vegetarian, String food, int legs) {
        super(vegetarian, food, legs);
        this.name=name;
        this.vegetarian=vegetarian;
        this.eats=food;
        this.noOfLegs=legs;
        this.color=color;
    }
    
    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
}
