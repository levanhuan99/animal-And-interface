package animalAndInterface;

public abstract class Fruit implements Edible {

}
class Apple extends Fruit{

    @Override
    public String howToEat() {
        return "slice me to eat";
    }
}
class  Orange extends  Fruit{

    @Override
    public String howToEat() {
        return "could be juiced";
    }
}
