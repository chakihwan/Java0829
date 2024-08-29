package cat;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("AICat");
        cat.setBreeds("Persian");
        cat.setWeight(3);

        System.out.printf("고양이 이름은 : %s  " + "고양이 품종은 : %s   " + "고양이 무게는 : %.2f㎏ \n",cat.getName(),cat.getBreeds(),cat.getWeight());

        System.out.print(cat.getName()+"이 ");
        cat.claw();

        System.out.print(cat.getName()+"이 ");
        cat.meow();
    }
}