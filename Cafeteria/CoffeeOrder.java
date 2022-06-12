package Cafeteria;

public class CoffeeOrder implements Order{


    @Override
    public String order() {
        System.out.println("커피를 시켰습니다.");
        return "커피를 시켰습니다.";
    }

    @Override
    public int Point() {
        System.out.println("포인트 적립을 했습니다.");
    }
}
