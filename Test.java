package animalAndInterface;

public class Test {
    public static void main(String[] args) {
        Animals[] animals=new Animals[2];
        animals[0]=new Tiger();
        animals[1]=new Chicken();
        for (Animals animal : animals){
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken){                                         //kiểm tra chicken có thuộc lớp animal k ,nếu thuộc thì ép kiểu
                Chicken chicken=(Chicken) animal;
                System.out.println(chicken.howToEat());
            }
        }
        Apple apple=new Apple();
        System.out.println(apple.howToEat());
        System.out.println("-------------");
        Orange orange =new Orange();
        System.out.println(orange.howToEat());

    }//Book book=(ProgrammingBook)Book
}
