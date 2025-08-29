package inheritance;

public class Sample {
    public static void main(String[] args) {
//        Dog dog = new Dog();
//        Animal dog2 = new Dog();
//        dog.setName("Meong-dol-yee");
//        System.out.println(dog.getName());
//        dog.sleep();
//        dog2.setName("Happy");
//        dog2.sleep();
        HouseDog houseDog = new HouseDog();
        houseDog.setName("Guard");
        houseDog.setAge(10);
        HouseDog houseDog2 = new HouseDog("Guard", 2);
        houseDog.sleep();
    }
}


