import java.util.Scanner;

public class Product {
    private String[] name;
    private double[] price;
    private String[] description;
    Scanner scn = new Scanner(System.in);


    //  생성자 게터 세터 등 필요한거 추가


    public Product(String name, double price, String description) {
        for (int i = 0; i < name.length() ; i++) {
            if(this.name[i] != null && this.price[i] != 0 && this.description[i] != null)
            this.name[i] = name;
            this.price[i] = price;
            this.description[i] = description;
        }
    }


    public void productSystem(){
        System.out.println("입고한 제품명을 입력하라");
        String productName = scn.nextLine();
        System.out.println("제품의 가격을 입력하라");
        String productPrice = scn.nextLine();
        System.out.println("해당 제품의 간략한 설명");
        String productDesc = scn.nextLine();

    }


    public String getName(i){
        return name[i];
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
