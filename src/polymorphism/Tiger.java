package polymorphism;

public class Tiger extends Animal implements Barkable {
    @Override
    public void bark() {
        System.out.println("Lion 으르렁");
    }
}
