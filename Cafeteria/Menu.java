package Cafeteria;

public enum Menu {

    Americano(5000,"쓴 맛","가나"),
    Espresso(5000,"쓴 맛","가나"),
    Latte(5000,"쓴 맛","가나"),
    Water(5000,"쓴 맛","가나"),
    Ice_Tea(5000,"쓴 맛","가나");


    int price;
    String taste;
    String country;


    public String getTaste() {
        return taste;
    }

    public int getPrice() {
        return price;
    }

    public String getCountry() {
        return country;
    }

    Menu(int price, String taste, String country) {
        this.price = price;
        this.taste = taste;
        this.country = country;
    }
}
