import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        LinkedList<Animals>animals=new LinkedList<>();
        LinkedList<Cat>cats=new LinkedList<>();
        Random random=new Random();
        for (int i = 1; i <51; i++) {
                animals.add(new Cat(i,random.nextInt(1,10)));
                animals.add(new Dog(i,random.nextInt(1,10)));
        }
        int counter=3;
        int count=0;
        for (int i = 0; i < animals.size(); i++) {
            if(animals.get(i) instanceof Dog){
                count++;
                if(count==counter){
                    animals.add(i,new Mouse(random.nextInt(1,18), random.nextInt(1,10)));
                    counter+=4;
                }
        }
        }
        for (int i = 0; i < animals.size(); i++) {
            if(animals.get(i) instanceof Mouse ){
                if(animals.get(i+1)instanceof Cat){
                    cats.add((Cat) animals.get(i+1));
                    animals.remove(i+1);
                }else if(animals.get(i-1)instanceof Cat){
                    cats.add((Cat) animals.get(i-1));
                    animals.remove(i-1);                }
            }
        }
        for (Animals animals1:animals) {
            System.out.println(animals1);
        }
       System.out.println(cats);

        LinkedList<Animals>animals1=new LinkedList<>();
        for (Animals animal : animals) {
            if (animal instanceof Cat) {
                animals1.addFirst(animal);
            } else if (animal instanceof Dog) {
                animals1.addLast(animal);
            }
        }
        for (Animals a:animals) {
            if(a instanceof Mouse){
                animals1.addLast(a);
            }
        }
        for (Animals a:animals1) {
            System.out.println(a);
        }
    }
}