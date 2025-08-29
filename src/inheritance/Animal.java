package inheritance;

public class Animal {
    protected String name;
    protected int age;
    public Animal(){
        this.name = "Animal";
    } // 디폴트 생성자(매개변수 없음, 자동 생성)
    void setName(String name) {
        this.name = name;
    }
    String getName() {
        return this.name;
    }
    void setAge(int age) {
        this.age = age;
    }
    int getAge() {
        return this.age;
    }
}

