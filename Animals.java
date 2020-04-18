package animalAndInterface;

public abstract class Animals {                                           //lớp chìu tượng
    public abstract String makeSound();
}
class Tiger extends Animals{                                                //lớp kế thừa của lớp trìu tượng
    @Override
    public  String makeSound(){
        return  "meow meow(:";
    }
}
class Chicken extends Animals implements Edible{                                 //lớp kế thừa của lớp trìu tượng
    @Override
    public  String makeSound(){
        return "quoac quoac";
    }

    @Override
    public String howToEat() {
        return "eating";
    }
}

