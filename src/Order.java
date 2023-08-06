
import java.util.Scanner;

public class Order {
    private User user;
    private Product product;
    private int quantity;
    private boolean isPaid;
    Scanner scn = new Scanner(System.in);


    //  생성자 게터 세터 등 필요한거 추가
    public void userCheck() {
        System.out.print("당신의 이름은>");
        String userInput0 = scn.nextLine();
        // if로 관리자인지 확인
        System.out.print("당신의 주소는>");
        String userInput1 = scn.nextLine();
        System.out.print("당신의 이메일은>");
        String userInput2 = scn.nextLine();
        user = new User(userInput0,userInput1,userInput2);
    }
    public User getUser() {
        return user;
    }

    public void processOrder(){
        System.out.println();


        System.out.println("몇개 주문할까요");
            scn.nextLine();
    }


}
