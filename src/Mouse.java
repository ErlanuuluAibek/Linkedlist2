public class Mouse extends Animals{

    public Mouse(int id, int age) {
        super(id, age);
    }
    @Override
    public String toString() {
        return "Mouse "+ "id: "+getId()+" age: "+getAge();
    }
}
