package inheritance;

public class HouseDog extends Dog {
    HouseDog() {} // 생성자를 추가하여 오류 방지
    HouseDog(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }
    void sleep() {
        super.sleep();
        System.out.println(this.name + "-zzzzzzz");
    }
}

