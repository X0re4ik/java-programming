package lr2;

class Speaking {
    private String _text;
    
    public Speaking(String text) {
        this._text = text;
    }

    public String getText() {
        return this._text;
    }

}


interface IMakeSound {
    public Speaking makeSound();
}

interface IMove {
    public void move(float longitude, float latitude);
}

interface IGo {
    public void go(float longitude, float latitude);
}

interface IFly {
    public void fly(float longitude, float latitude);
}

interface IEat {
    public void eat();
}


class Position {
    public float longitude;
    public float latitude;

    public Position(float longitude, float latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }
    
} 


abstract class Animal implements IEat, IMove {
    private int _age;
    private String _name;
    private Position _position;
    
    public Animal(String name, int age) {
        this._age = age;
        this._name = name;
        this._position = new Position(0.0f, 0.0f);
    }
    
    public Animal(String name, int age, Position position) {
        this(name, age);
        this._position = position;
    }


    public int getAge() {
        return this._age;
    }

    public String getName() {
        return this._name;
    }

    public Position getPosition() {
        return this._position;
    }

    @Override
    public void eat() {
        System.out.println("Ням-Ням");
    }


    @Override
    public void move(float longitude, float latitude) {
        this._position.latitude = latitude;
        this._position.longitude = longitude;
    }
}


class Mammal extends Animal implements IGo {

    public Mammal(String name, int age) {
        super(name, age);
    }

    @Override
    public void go(float longitude, float latitude) {
        this.move(longitude, latitude);
    }
}

class Dog extends Mammal implements IMakeSound {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public Speaking makeSound() {
        return new Speaking("Ну предположим... Гав Гав");
    }
}


class Bird extends Animal implements IFly {

    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void fly(float longitude, float latitude) {
        this.move(longitude, latitude);
    }
}

class Golub extends Bird implements IMakeSound {

    public Golub(String name, int age) {
        super(name, age);
    }

    @Override
    public Speaking makeSound() {
        return new Speaking("Курлык курлык");
    }
}




public class Example8
{
	public static void main(String[] args) {

        Golub golub = new Golub("Антон", 45);
        System.out.println(golub.makeSound().getText());
        golub.fly(5, 5);
        System.out.println(golub.getPosition().latitude);
        
        Dog dog = new Dog("Андрей", 23);
        System.out.println(dog.makeSound().getText());
        dog.go(5, 5);
        System.out.println(dog.getPosition().latitude);
    }
}