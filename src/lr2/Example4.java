package lr2;

class Person {
    private String _name;
    private int _age;
    private char _sex;
    
    public Person(String name, int age, char sex) {
        this._name = name;
        this._age = age;
        this._sex = sex;
    }
    
    
    public String getName() {
        return this._name;
    }
    
    public int getAge() {
        return this._age;
    }
    
    public char getSex() {
        return this._sex;
    }
    
    
    
    public void setName(String name) {
        this._name = name;
    }
    
    public void setAge(int age) {
        this._age = age;
    }
    
    public void setSex(char sex) {
        this._sex = sex;
    }
    
}



public class Example4
{
	public static void main(String[] args) {
        Person person = new Person("Антон", 22, 'М');
        System.out.println("Name: " + person.getName());
    }
}