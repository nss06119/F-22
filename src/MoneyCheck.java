import java.util.ArrayList;

public class MoneyCheck {
    public static void main(String[] args) {
        ArrayList<String> pocket = new ArrayList<String>();
        pocket.add("5000");
        pocket.add("CheckCard");
        pocket.add("Glock 17");
        int money = Integer.parseInt(pocket.get(0));

        if (pocket.contains("CheckCard")) {
            System.out.println("택시 탑승");
        } else if (money >= 3000) {  // 이미 변환된 money 변수 사용
            System.out.println("택시 탑승");
        } else if (pocket.contains("Glock 17")) {
                System.out.println("택시 탈취");
        } else {
            System.out.println("걸어가기");  // 따옴표 추가
        }
    }
}
