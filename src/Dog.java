public class Dog extends Animals{
    public Dog(int id, int age) {
        super(id, age);
    }

    @Override
    public String toString() {
        return "Dog "+ "id: "+getId()+" age: "+getAge();
    }
}
